package epam.courses.basicsOfOOP.module5.task4.cave;

import epam.courses.basicsOfOOP.module5.task4.treasure.Treasure;
import epam.courses.basicsOfOOP.module5.task4.treasure.TreasureLogic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DragonCaveLogic {
    private static DragonCaveLogic dragonCaveLogic;

    private DragonCaveLogic() {}

    public static DragonCaveLogic getInstance() {
        if (dragonCaveLogic == null) {
            dragonCaveLogic = new DragonCaveLogic();
        }
        return dragonCaveLogic;
    }

    public void printTreasures(DragonCave cave) {
        for (Treasure treasure: cave.getTreasures()) {
            TreasureLogic.getInstance().printTreasure(treasure);
        }
    }

    public void printTreasures(List<Treasure> treasures) {
        for (Treasure treasure: treasures) {
            TreasureLogic.getInstance().printTreasure(treasure);
        }
    }

    public Treasure findMostExpensiveTreasure(DragonCave cave){
        int maxPrice = 0;
        Treasure mostExpensive = null;
        for (Treasure treasure: cave.getTreasures()){
            if (treasure.getPrice() > maxPrice){
                mostExpensive = treasure;
                maxPrice = mostExpensive.getPrice();
            }
        }
        return mostExpensive;
    }

    public List<Treasure> findTreasuresForPrice(int price, DragonCave cave){
        List<Treasure> list = new ArrayList<>();
        for (Treasure treasure: cave.getTreasures()) {
            if (treasure.getPrice() == price) {
                list.add(treasure);
            }
        }
        return list;
    }

    public void sortPrice(DragonCave cave) {
        Comparator<Treasure> comparator = new Comparator<Treasure>() {
            @Override
            public int compare(Treasure treasure1, Treasure treasure2) {
                return treasure1.getPrice() - treasure2.getPrice();
            }
        };
        cave.getTreasures().sort(comparator);
    }
}
