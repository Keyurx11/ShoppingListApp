package com.example.shoppinglistapp;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemList {
   private ArrayList<String> shoppingList = new ArrayList<String>();

   Scanner scanner = new Scanner(System.in);

   void addItem(String item) {
      shoppingList.add(item);
   }

   void removeItem() {
      for (int i = 0; i < shoppingList.size(); i++) {
         viewItem();
         System.out.println(shoppingList.get(i));
      }
      System.out.println("Please enter the item you would like to remove: ");
      int itemNumber = scanner.nextInt();
      shoppingList.remove(itemNumber);
   }
   void viewItem() {
      for (int i = 0; i < shoppingList.size(); i++) {
         System.out.print(i);
         System.out.println(shoppingList.get(i));
      }
   }
}

