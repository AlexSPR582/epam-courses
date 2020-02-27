package epam.courses.basicsOfOOP.module5.task4.cave;

import epam.courses.basicsOfOOP.module5.task4.treasure.Treasure;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DragonCave {
    private List<Treasure> treasures;

    public DragonCave(){
        treasures = new ArrayList<>();
    }

    public void readTreasuresFromFile(String fileName) {
        try (FileReader fr = new FileReader(fileName);
             Scanner sc = new Scanner(fr)) {
            Pattern pattern = Pattern.compile("(.+)\\s(\\d+)$");
            while (sc.hasNextLine()){
                Matcher matcher = pattern.matcher(sc.nextLine());
                if (matcher.find()){
                    treasures.add(new Treasure(matcher.group(1),
                            Integer.parseInt(matcher.group(2))));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeTreasuresToFile(String fileName) {
        try (FileWriter fw = new FileWriter(fileName);
             PrintWriter pw = new PrintWriter(fw)) {
            for (Treasure treasure : treasures) {
                pw.println(treasure.getName() + " " + treasure.getPrice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }
}
