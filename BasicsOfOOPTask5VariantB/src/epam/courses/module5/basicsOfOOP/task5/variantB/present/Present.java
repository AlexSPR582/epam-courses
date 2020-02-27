package epam.courses.module5.basicsOfOOP.task5.variantB.present;

import epam.courses.module5.basicsOfOOP.task5.variantB.presentComponents.Packaging;
import epam.courses.module5.basicsOfOOP.task5.variantB.presentComponents.Sweets;

import java.util.Arrays;
import java.util.Objects;

public class Present {
    private Sweets[] sweets;
    private Packaging packaging;

    private Present(Builder builder) {
        this.sweets = builder.getSweets();
        this.packaging = builder.getPackaging();
    }

    public static class Builder {
        private Sweets[] sweets;
        private Packaging packaging;

        public Present build() {
            return new Present(this);
        }

        public void setSweets(Sweets... sweets) {
            this.sweets = sweets;
        }

        public void setPackaging(Packaging packaging) {
            this.packaging = packaging;
        }

        public Sweets[] getSweets() {
            return sweets;
        }

        public Packaging getPackaging() {
            return packaging;
        }
    }

    public Sweets[] getSweets() {
        return sweets;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    @Override
    public String toString() {
        return "Present{" +
                "sweets=" + Arrays.toString(sweets) +
                ", packaging=" + packaging +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Present present = (Present) o;
        return Arrays.equals(sweets, present.sweets) &&
                packaging == present.packaging;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(packaging);
        result = 31 * result + Arrays.hashCode(sweets);
        return result;
    }
}
