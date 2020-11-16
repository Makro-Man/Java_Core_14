package ua.lviv.lgs.SetApp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Car> se = new HashSet<>();
        se.add(new Car("BMW",2.2,"M240i"));
        se.add(new Car("Mersedes",3.1,"C180"));
        se.add(new Car("Opel",1.8,"Astra"));
        se.add(new Car("Toyota",2.2,"Camry"));
        se.add(new Car("Ford",1.6,"Focus"));
        for (Car car:se){
            System.out.println(car);
        }
        System.out.println();
        Set<Car> set = new TreeSet<>( new SortingComparator());
        set.add(new Car("BMW",2.2,"M240i"));
        set.add(new Car("Mersedes",3.1,"C180"));
        set.add(new Car("Opel",1.8,"Astra"));
        set.add(new Car("Toyota",2.2,"Camry"));
        set.add(new Car("Ford",1.6,"Focus"));
        for (Car car:set){
            System.out.println(car);
        }
        System.out.println();
        Set<Car> sets = new TreeSet<>();
        sets.add(new Car("BMW",2.2,"M240i"));
        sets.add(new Car("Mersedes",3.1,"C180"));
        sets.add(new Car("Opel",1.8,"Astra"));
        sets.add(new Car("Toyota",2.2,"Camry"));
        sets.add(new Car("Ford",1.6,"Focus"));
        for (Car car:sets){
            System.out.println(car);
        }

    }
}
