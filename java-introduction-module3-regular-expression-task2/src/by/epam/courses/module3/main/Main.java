package by.epam.courses.module3.main;

import by.epam.courses.module3.analyzer.node.NodeLogic;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = readFromFile();
        NodeLogic logic = new NodeLogic();
        logic.printNodes(str);

    }

    public static String readFromFile() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader("file.txt")) {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine().trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
