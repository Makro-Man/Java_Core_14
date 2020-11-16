package ua.lviv.lgs.ComodityApp;

import java.util.*;

public class Commodity {
    private String name;
    private int weight;
    private int width;
    private int lenght;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Commodity(String name, int weight, int width, int lenght) {
        this.name = name;
        this.weight = weight;
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return weight == commodity.weight &&
                width == commodity.width &&
                lenght == commodity.lenght &&
                Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, width, lenght);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", width=" + width +
                ", lenght=" + lenght +
                '}';
    }

    }

