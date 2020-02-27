package epam.courses.module5.basicsOfOOP.task5.variantB.present;

import java.util.Arrays;

public class PresentLogic {
    private static PresentLogic presentLogic;

    private PresentLogic() {}

    public static PresentLogic getInstance() {
        if (presentLogic == null) {
            presentLogic = new PresentLogic();
        }
        return presentLogic;
    }

    public void printPresent(Present present) {
        System.out.println("Упаковка: " + present.getPackaging());
        System.out.println("Сладости: " + Arrays.toString(present.getSweets()));
    }
}
