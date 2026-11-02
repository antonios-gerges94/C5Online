package day7;

import java.awt.*;

public abstract class Shape {
    public abstract double calculateArea();
    public void paint() {
        System.out.println("This is concrete method");
    }
}
