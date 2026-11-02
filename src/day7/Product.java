package day7;

public interface Product {
    void setName(String name);
    void setColor(String color);
    void setPrice(double price);
    String getName();
    String getColor();
    double getPrice();
    default String getBarCode() {
        return "default barcode";
    }
}


// Diff bet Interface & Abstract:
// For Interface: A class can implement from more than one interface  ,  All methods are abstract and public by default
// and fields are public, static and final by default

// For Abstract:  We can't inherit (extend) from more than one abstract class
