package epam.courses.module4.AggregationAndComposition.task3.region;

public class Region {
    private Area[] areas;
    private String[] regionCenters;

    public Region(Area[] areas, String[] regionCenters) {
        this.areas = areas;
        this.regionCenters = regionCenters;
    }


    public String[] getRegionCenters() {
        return regionCenters;
    }

    public void setRegionCenters(String[] regionCenters) {
        this.regionCenters = regionCenters;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }
}
