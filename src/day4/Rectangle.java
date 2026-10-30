package day4;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        System.out.println("This is default constructor");
        length = 20;
        width = 10;
    }

    public Rectangle(double length, double width) {
        System.out.println("This is parameterized constructor");
        this.length = length;
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double calculateArea(){
        return length*width;
    }
    double calculatePerimeter(){
        return 2*(length+width);
    }
}
