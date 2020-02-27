package epam.courses.module6.task3.client;

import java.io.*;
import java.net.Socket;

public class UserLogic {
    private Socket clientSocket;
    private BufferedReader in;
    private PrintStream out;
    private User user;

    public UserLogic(User client){
        this.user = client;
    }

    public void connect(){
        try {
            clientSocket = new Socket("127.0.0.1", 4004);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintStream(clientSocket.getOutputStream());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void watchArchive(String id){
        out.println("watch/" + id + '/'+ user.getPassword());
        out.flush();
        try {
            for (int i = 0; i < 5; i++){
                String answer = in.readLine();
                System.out.println(answer);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void changeArchive(String id, String element, String newValue){
        out.println("change/" + id + '/' +
                element + '/' + newValue + '/' + user.getPassword());
        out.flush();
        try {
            String answer1 = in.readLine();
            System.out.println(answer1);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void createFile(String id, String name, String surname,
                           String faculty){
        out.println("create/" + id + '/' + name + '/' +
                surname + '/' + faculty + '/' + user.getPassword());
        out.flush();
        try {
            String answer1 = in.readLine();
            System.out.println(answer1);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public void closeConnection(){
        try {
            clientSocket.close();
            in.close();
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
