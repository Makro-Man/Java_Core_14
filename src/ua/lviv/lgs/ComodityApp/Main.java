package ua.lviv.lgs.ComodityApp;

import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("Enter 1 to add a product");
        System.out.println("Enter 2 to Delete the item");
        System.out.println("Enter 3 to Replace the item");
        System.out.println("Enter 4 to Sort by name");
        System.out.println("Enter 5 to Sort by length");
        System.out.println("Enter 6 to Sort by width");
        System.out.println("Enter 7 to Sort by weight");
        System.out.println("Enter 8 to output the i-th element of the collection");
        System.out.println("Enter 9 to exit the program");
    }

    public static void main(String[] args) {
        MethodsCommodity methodsCommodity = new MethodsCommodity();
        Scanner scanner = new Scanner(System.in);
        while (true){
            menu();
            switch (scanner.nextInt()){
                case 1:{
                    methodsCommodity.add();
                    break;
                }
                case 2:{
                    methodsCommodity.delete();
                    break;
                }
                case 3:{
                    methodsCommodity.replace();
                    break;
                }
                case 4:{
                    methodsCommodity.sortingName();
                    break;
                }
                case 5:{
                    methodsCommodity.sortingLenght();
                    break;
                }
                case 6:{
                    methodsCommodity.sortingWidth();
                    break;
                }
                case 7:{
                    methodsCommodity.sortingWeight();
                    break;
                }
                case 8:{
                    methodsCommodity.getCommodity();
                    break;
                }
                case 9:{
                    methodsCommodity.exit();
                    break;
                }

            }
        }

    }
}
