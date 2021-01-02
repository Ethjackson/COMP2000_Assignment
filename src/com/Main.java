package com;

public class Main {

    public static void main(String[] args) {
        Admins admins = new Admins();
        admins.Order_items("100", "0123", "cos", "2.99");


        StockDatabase stockDatabase = new StockDatabase();
        stockDatabase.admins = admins;
        stockDatabase.Add_item();
        admins.Access_items();
    }
}
