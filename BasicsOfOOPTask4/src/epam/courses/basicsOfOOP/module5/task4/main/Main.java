package epam.courses.basicsOfOOP.module5.task4.main;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона.  Реализовать  возможность  просмотра  сокровищ,  выбора  самого  дорогого  по  стоимости  сокровища  и
выбора сокровищ на заданную сумму. */

import epam.courses.basicsOfOOP.module5.task4.cave.*;
import epam.courses.basicsOfOOP.module5.task4.treasure.TreasureLogic;

public class Main {
    public static void main(String[] args) {
        DragonCave dc = new DragonCave();
        DragonCaveLogic dcl = DragonCaveLogic.getInstance();

        System.out.println("ПРОСМОТР ВСЕХ СОКРОВИЩ:" + '\n');
        dc.readTreasuresFromFile("inputTreasures.txt");
        dcl.sortPrice(dc);
        dcl.printTreasures(dc);

        System.out.println("CАМОЕ ДОРОГОЕ СОКРОВИЩЕ:");
        TreasureLogic.getInstance().printTreasure(dcl.findMostExpensiveTreasure(dc));

        System.out.println("СОКРОВИЩА НА ЗАДАННУЮ СУММУ:");
        dcl.printTreasures(dcl.findTreasuresForPrice(2500, dc));

        dc.writeTreasuresToFile("outputTreasures.txt");
    }
}
