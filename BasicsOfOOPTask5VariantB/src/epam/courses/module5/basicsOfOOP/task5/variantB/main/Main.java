package epam.courses.module5.basicsOfOOP.task5.variantB.main;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
•  Корректно спроектируйте и реализуйте предметную область задачи.
•  Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
•  Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
•  для проверки корректности переданных данных можно применить регулярные выражения.
•  Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
•  Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
        подарок). Составляющими целого подарка являются сладости и упаковка.*/

import epam.courses.module5.basicsOfOOP.task5.variantB.present.Present;
import epam.courses.module5.basicsOfOOP.task5.variantB.present.PresentLogic;
import epam.courses.module5.basicsOfOOP.task5.variantB.presentComponents.Packaging;
import epam.courses.module5.basicsOfOOP.task5.variantB.presentComponents.Sweets;

public class Main {
    public static void main(String[] args) {
        Present.Builder builder1 = new Present.Builder();
        builder1.setPackaging(Packaging.CARDBOARD);
        builder1.setSweets(Sweets.BISCUIT, Sweets.CHOCOLATE);
        Present present1 = builder1.build();
        PresentLogic.getInstance().printPresent(present1);
    }
}
