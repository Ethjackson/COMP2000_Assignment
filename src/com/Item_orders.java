package com;

public class Item_orders {
    public String Item;
    public String Barcode;
    public String Name;
    public String Price;
    public StockDatabase stockDatabase;

    String getItem() {
        return this.Item;
    }

    void setItem(String value) {
        this.Item = value;
    }

    String getBarcode() {
        return this.Barcode;
    }

    void setBarcode(String value) {
        this.Barcode = value;
    }

    void setName(String value) {
        this.Name = value;
    }

    String getName() {
        return this.Name;
    }

    void setPrice(String value) {
        this.Price = value;
    }

    String getPrice() {
        return this.Price;
    }
}
