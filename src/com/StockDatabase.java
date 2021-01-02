package com;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class StockDatabase {
    public String All_items;

    public String Admin_users;

    public Admins admins;

    public void Add_item() {
        File stockFile = new File("stock.csv");
        try {
            FileWriter addStock = new FileWriter(stockFile, true);
            Scanner readLine = new Scanner(stockFile);
            int total = 0;
            int counter = 0;
            String existing = "";
            while (readLine.hasNextLine()) {
                String nextLine = readLine.nextLine();
                if (nextLine.contains(admins.item_orders.getBarcode())) {
                    existing = nextLine.substring(1, nextLine.indexOf('"', 1));
                    total = Integer.parseInt(admins.item_orders.getItem()) + Integer.parseInt(existing);
                    addStock.append(existing, counter, counter);
                    System.out.println(total);
                    return;
                } else if (readLine.nextLine() != null){
                    addStock.append("\n");
                    addStock.append('"' + admins.item_orders.getItem() + '"' + ',');
                    addStock.append('"' + admins.item_orders.getBarcode() + '"' + ',');
                    addStock.append('"' + admins.item_orders.getName() + '"' + ',');
                    addStock.append('"' + admins.item_orders.getPrice() + '"' + ',');
                }
                counter++;
            }
            readLine.close();
            addStock.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Remove_item() {

    }

    public void Edit_Item() {

    }

}
