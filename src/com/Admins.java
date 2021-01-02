package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Admins {
    public String Item_orders;

    public String Name;

    public String Password;

    public Item_orders item_orders;

    public void Login(String Name, String Password) {

    }

    public void Access_items() {
        File stockFile = new File("stock.csv");
        try {
            Scanner readStock = new Scanner(stockFile);
            while (readStock.hasNextLine()){
                String nextline = readStock.nextLine();
                String[] readoutput = nextline.split(",");
                for (String string : readoutput) {
                   // System.out.println(string);
                }
            }
            readStock.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Low_item_warning() {

    }

    public void Order_items(String Item, String Barcode, String Name, String Price) {
        item_orders = new Item_orders();
        item_orders.setItem(Item);
        item_orders.setBarcode(Barcode);
        item_orders.setName(Name);
        item_orders.setPrice(Price);
    }

    public void Replenish_items_on_delivery() {

    }

}
