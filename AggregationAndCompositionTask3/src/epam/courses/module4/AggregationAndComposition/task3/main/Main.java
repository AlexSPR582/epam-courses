package epam.courses.module4.AggregationAndComposition.task3.main;

public class Main {
    public static void main(String[] args) {
        City[] cities1 = {new City("Минск"), new City("Столбцы")};
        City[] cities2 = {new City("Витебск"), new City("Орша")};
        Area area1 = new Area(cities1);
        Area area2 = new Area(cities2);
        Area[] areas1 = {area1, area2};
        String[] regionalCenters1 = {"Образовательный РЦ1", "Медицинский РЦ1"};
        Region region1 = new Region(areas1, regionalCenters1);

        City[] cities3 = {new City("Брест"), new City("Гродно")};
        City[] cities4 = {new City("Молигёв"), new City("Столбцы")};
        Area area3 = new Area(cities3);
        Area area4 = new Area(cities4);
        Area[] areas2 = {area3, area4};
        String[] regionalCenters2 = {"Образовательный РЦ2", "Медицинский РЦ2"};
        Region region2 = new Region(areas2, regionalCenters2);

        Region[] regions = {region1, region2};
        State state = new State(regions, new City("Столица Минск"), 700);

        state.printRegionCenters();
    }
}
