package ua.lviv.lgs.ComodityApp;

import java.util.Comparator;

public class SortingLength implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getLenght()>o2.getLenght()){
            return 1;
        }else if (o1.getLenght()<o2.getLenght()){
            return -1;
        }
        return 0;
    }
}
