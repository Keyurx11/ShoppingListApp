package com.example.shoppinglistapp;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemList {
   private ArrayList<String> shoppingList = new ArrayList<String>();

   Scanner scanner = new Scanner(System.in);

   void addItem(String item) {
      shoppingList.add(item);
      System.out.println("\nItem added to list.");
   }

   void removeItem() {
      viewItem();
      System.out.println("Please enter the item number you would like to remove: ");
      int itemNumber = scanner.nextInt();
      shoppingList.remove(itemNumber - 1);
      System.out.println("\nItem removed successfully.");
   }
   void viewItem() {
      for (int i = 0; i < shoppingList.size(); i++) {
         System.out.print(i+1);
         System.out.print(" - ");
         System.out.println(shoppingList.get(i));
      }
   }
}

