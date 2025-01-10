package Udemy.MapCollection.task2;

import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulation;

    public CityPopulationTracker() {
        this.cityPopulation = new HashMap<>();
    }

    public City getCity(String name) {
        return this.cityPopulation.get(name);
    }

    public void setCity(City city) {
        this.cityPopulation.put(city.getName(), city);
    }

    public void addCity(City city) {
        if (this.cityPopulation.containsKey(city.getName())) {
            throw new IllegalArgumentException("City already exists");
        }
        this.cityPopulation.put(city.getName(), city);
    }
}
