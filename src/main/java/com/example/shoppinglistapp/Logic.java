package com.example.shoppinglistapp;

import java.util.Scanner;

public class Logic {

    static ItemList itemList = new ItemList();

    public static void menu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("1 to add item to the shopping list");
        System.out.println("2 to remove item to the shopping list");
        System.out.println("3 to view items in the shopping list");
        System.out.print("Please select one of the above options: ");
        int userSelection = scanner.nextInt();
        if (userSelection == 1) {
            System.out.print("Please enter the item you would like to add: ");
            String ignore = scanner.nextLine(); //ignore
            String item = scanner.nextLine();
            itemList.addItem(item);
            menu();
        } else if (userSelection == 2) {
            itemList.removeItem();
            menu();
        } else if (userSelection == 3) {
            itemList.viewItem();
            menu();
        } else {
            menu();
        }
    }
}
