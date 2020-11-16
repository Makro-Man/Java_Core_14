package ua.lviv.lgs.SetApp;

import java.util.Comparator;

public class SortingComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        }

        else {
            if (o1.getModel().compareTo(o2.getModel()) > 0) {
                return 1;
            } else if (o1.getModel().compareTo(o2.getModel()) < 0) {
                return -1;
            }

            return 0;

        }
    }
}
