package epam.courses.module4.AggregationAndComposition.task3.area;

import epam.courses.module4.AggregationAndComposition.task3.city.City;

public class Area {
    private City[] cities;

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public Area(City[] cities) {
        this.cities = cities;
    }
}
