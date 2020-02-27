package epam.courses.module6.task3.server;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ServerLogic {
    private static ServerLogic serverLogic;
    private ServerSocket server;
    private Socket clientSocket;
    private BufferedReader in;
    private PrintStream out;

    private ServerLogic(){}

    protected static ServerLogic getInstance(){
        if (serverLogic == null){
            serverLogic = new ServerLogic();
        }
        return serverLogic;
    }

    protected void start(){
        try {
            System.out.println("Сервер запущен");
            server = new ServerSocket(4004);
            clientSocket = server.accept();
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintStream(clientSocket.getOutputStream());;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createFile(String id, String name, String surname,
                           String faculty) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.newDocument();

            Element rootElement = doc.createElement("student");
            doc.appendChild(rootElement);

            Element studentName = doc.createElement("name");
            studentName.appendChild(doc.createTextNode(name));

            Element studentAddress = doc.createElement("surname");
            studentAddress.appendChild(doc.createTextNode(surname));

            Element studentFaculty = doc.createElement("faculty");
            studentFaculty.appendChild(doc.createTextNode(faculty));

            rootElement.appendChild(studentName);
            rootElement.appendChild(studentAddress);
            rootElement.appendChild(studentFaculty);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            String path = "archive/" + id + ".xml";
            StreamResult result = new StreamResult(new FileWriter(path));
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException
                | IOException e) {
            e.printStackTrace();
        }
    }

    private void changeFile(String id, String element, String newValue){
        try {
            String path = "archive/" + id + ".xml";
            File file = new File(path);
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(file);

            Node node = doc.getElementsByTagName(element).item(0);
            node.setTextContent(newValue);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

        } catch (ParserConfigurationException | SAXException | TransformerException | IOException e){
            e.printStackTrace();
        }
    }

    private void sendInfo(String id){
        try {
            String path = "archive/" + id + ".xml";
            File file = new File(path);
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(file);

            StringBuilder message = new StringBuilder();
            message.append("student id " + id);
            Element element = doc.getDocumentElement();
            NodeList info = element.getChildNodes();
            for (int i = 0; i < info.getLength(); i++){
                message.append(info.item(i).getTextContent().replace(" ", ""));
            }
            out.println(message.toString());
            out.flush();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private void parseRequest(String request) {
        Pattern pattern = Pattern.compile("^([a-z]+)/");
        Matcher matcher = pattern.matcher(request);
        if (matcher.find()) {
            switch (matcher.group(1)) {
                case "watch":
                    Pattern pattern1 = Pattern.compile("^([a-z]+)/(\\d+)/(\\d+)$");
                    Matcher matcher1 = pattern1.matcher(request);
                    if (matcher1.find()) {
                        if (matcher1.group(3).equals("1111")
                                || matcher1.group(3).equals("1234")) {
                            String id = matcher1.group(2);
                            sendInfo(id);
                        } else {
                            out.println("Вы не обладаете необходимыми правами доступа");
                            out.flush();
                        }
                    }
                    break;

                case "change":
                    Pattern pattern2 = Pattern.compile("^([a-z]+)/(\\d+)/([a-z]+)/([a-zA-Z]+)/(\\d+)$");
                    Matcher matcher2 = pattern2.matcher(request);
                    if (matcher2.find()) {
                        if (matcher2.group(5).equals("1234")) {
                            String id = matcher2.group(2);
                            String element = matcher2.group(3);
                            String newValue = matcher2.group(4);
                            changeFile(id, element, newValue);
                            out.println("Операция проведена успешно: Данные в файле были изменены");
                            out.flush();
                        } else {
                            out.println("Вы не обладаете необходимыми правами доступа");
                            out.flush();
                        }
                    }
                    break;

                case "create":
                    Pattern pattern3 = Pattern.compile("^([a-z]+)/(\\d+)/([a-zA-Z]+)/([a-zA-Z]+)/([a-zA-Z]+)/(\\d+)$");
                    Matcher matcher3 = pattern3.matcher(request);
                    if (matcher3.find()){
                        if (matcher3.group(6).equals("1234")) {
                            String id = matcher3.group(2);
                            String name = matcher3.group(3);
                            String surname = matcher3.group(4);
                            String faculty = matcher3.group(5);
                            createFile(id, name, surname, faculty);
                            out.println("Операция проведена успешно: Создан новый файл");
                            out.flush();
                        }
                        else {
                            out.println("Вы не обладаете необходимыми правами доступа");
                            out.flush();
                        }
                    }
                    break;
            }
        }
    }

    protected void getRequests(){
        try {
            while (true){
                String request = in.readLine();
                if (request == null){
                    break;
                }
                parseRequest(request);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void exit(){
        try {
            server.close();
            clientSocket.close();
            in.close();
            out.close();
            System.out.println("Сервер завершил работу");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
