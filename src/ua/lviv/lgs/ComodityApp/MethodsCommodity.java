package ua.lviv.lgs.ComodityApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MethodsCommodity {

    ArrayList<Commodity> commodityList = new ArrayList<>();
    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter lenght: ");
        int lenght = scanner.nextInt();
        Commodity commodity = new Commodity(name,weight,width,lenght);
        commodityList.add(commodity);
        System.out.println("Goods "+commodity.toString()+" successfully added");
    }
    public void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter lenght: ");
        int lenght = scanner.nextInt();

        boolean Correct = isCommodityExist(commodityList,name,weight,width,lenght);
        if (Correct){
            Iterator<Commodity> iterator = commodityList.iterator();
            while (iterator.hasNext()){
                Commodity next = iterator.next();
                if (next.getWeight() == weight && next.getName().equalsIgnoreCase(name) &&
                        next.getWidth() == width && next.getLenght() == lenght){
                    iterator.remove();
                    System.out.println("Goods successfully deleted.");
                }
            }
        }else{
            System.out.println("No goods");
        }


    }
    public void replace(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter lenght: ");
        int lenght = scanner.nextInt();
        boolean Correct = isCommodityExist(commodityList,name,weight,width,lenght);
        if (Correct){
            for (Commodity commodity:commodityList){
                if (commodity.getName().equalsIgnoreCase(name) && commodity.getWidth() == width && commodity.getWeight() == weight
                        && commodity.getLenght() == lenght){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.println("Enter new weight: ");
                    int newWeight = sc.nextInt();
                    System.out.println("Enter new width: ");
                    int newWidth = sc.nextInt();
                    System.out.println("Enter new lenght: ");
                    int newLength = sc.nextInt();
                    commodity.setName(newName);
                    commodity.setWidth(newWidth);
                    commodity.setWeight(newWeight);
                    commodity.setLenght(newLength);
                }
            }
        }else{
            System.out.println("No goods");
        }
    }
    public void sortingName(){
        Collections.sort(commodityList, new SortingName());
        for (Commodity commodity:commodityList){
            System.out.println(commodity);
        }
    }
    public void sortingLenght(){
        Collections.sort(commodityList,new SortingLength());
        for (Commodity commodity:commodityList){
            System.out.println(commodity);
        }

    }
    public void sortingWidth(){
        Collections.sort(commodityList,new SortingWidth());
        for (Commodity commodity:commodityList){
            System.out.println(commodity);
        }
    }
    public void sortingWeight(){
        Collections.sort(commodityList,new SortingWieght());
        for (Commodity commodity:commodityList){
            System.out.println(commodity);
        }
    }
    public void getCommodity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int nomer = scanner.nextInt();
        if (nomer > 0 || nomer>commodityList.size()-1){
            System.out.println("No goods");
        }else {
            System.out.println("That number is: "+commodityList.get(nomer).toString());
        }

    }
    public void exit(){
        System.exit(0);
    }
    boolean isCommodityExist(ArrayList<Commodity> commodityList, String name, int weight, int width, int lenght){
        boolean flag = false;

        for (Commodity commodity : commodityList) {
            if (commodity.getName().equalsIgnoreCase(name) && commodity.getWeight() == weight
                    && commodity.getWidth() == width && commodity.getLenght() == lenght) {
                flag = true;
            }
        }

        return flag;
    }
}
