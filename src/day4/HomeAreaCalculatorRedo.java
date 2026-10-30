package day4;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo home = new HomeAreaCalculatorRedo();
        Rectangle kitchen = home.getRoomDimensions();
        Rectangle bathroom = home.getRoomDimensions();

        home.scanner.close();
        double totalArea = home.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area  " + totalArea);
    }

    Rectangle getRoomDimensions(){

        System.out.println("Enter the room length: ");
        double Length = scanner.nextDouble();

        System.out.println("Enter the room width: ");
        double Width = scanner.nextDouble();

//        Rectangle room = new Rectangle(Length, Width);
//        return room;
        return new Rectangle(Length, Width);
    }

    double calculateTotalArea(Rectangle kitchen, Rectangle bathroom){
        return kitchen.calculateArea() + bathroom.calculateArea();
    }

}
