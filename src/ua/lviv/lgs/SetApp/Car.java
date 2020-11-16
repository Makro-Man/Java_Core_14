package ua.lviv.lgs.SetApp;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private String name;
    private double engine;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String name, double engine, String model) {
        this.name = name;
        this.engine = engine;
        this.model = model;
    }


        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (!(o instanceof Car)) return false;
            Car car = (Car) o;
            return Double.compare(car.getEngine(), getEngine()) == 0 &&
                    Objects.equals(getName(), car.getName()) &&
                    Objects.equals(getModel(), car.getModel());
        }

        @Override
        public int hashCode () {
            return Objects.hash(getName(), getEngine(), getModel());
        }

        @Override
        public String toString () {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", engine=" + engine +
                    ", model='" + model + '\'' +
                    '}';
        }

    @Override
    public int compareTo(Car o) {
        return model.compareTo(o.getModel());
    }
}
