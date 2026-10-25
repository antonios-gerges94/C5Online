package day2;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        // what we need
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number Of Items : ");
        int number0fItems = scanner.nextInt(); //3
        double total=0;
        for(int i=1;i<=number0fItems;i++){
            System.out.println("Please enter the price of item "+i);
            double price = scanner.nextDouble();
            total+=price;
        }
        scanner.close();
        System.out.println("The total price is "+total);
    }
}