package epam.courses.module4.AggregationAndComposition.task3.state;

import epam.courses.module4.AggregationAndComposition.task3.city.City;
import epam.courses.module4.AggregationAndComposition.task3.region.Region;

public class State {
    private Region[] regions;
    private City capital;
    private int stateArea;

    public State(Region[] regions, City city, int stateArea) {
        this.regions = regions;
        this.capital = city;
        this.stateArea = stateArea;
    }

    public int getStateArea() {
        return stateArea;
    }

    public void setStateArea(int stateArea) {
        this.stateArea = stateArea;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void printCapital(){
        System.out.println(this.capital.getName());
    }

    public void regionsNumber(){
        System.out.println(regions.length);
    }

    public void printRegionCenters(){
        for (Region region: regions){
            for (String center: region.getRegionCenters()){
                System.out.println(center);
            }
        }
    }

    public void printStateArea(){
        System.out.println(stateArea + " тыс.кв.км.");
    }
}
