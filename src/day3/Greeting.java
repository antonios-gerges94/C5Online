package day3;

import java.util.Scanner;

public class Greeting {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            String name = getUserName();
            greetUser(name);
            scanner.close();
        }

        static String getUserName() {

            System.out.println("Enter Your Name : ");
            String name = scanner.nextLine();
            return name;

        }

        static void greetUser(String name) {
            System.out.println("Hello "+name);
        }
    }