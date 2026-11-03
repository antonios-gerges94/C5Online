package day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
//        createFile();
//        numbersExceptionHandling();
        try {
            createFileRethrow();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello from Exception 2");
    }

    public static void createFile(){
        File file = new File("resources/text.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory not found");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello After Exception");
    }

    public static void createFileRethrow() throws IOException {
        File file = new File("resourcess/text.txt");
        file.createNewFile();
        System.out.println("Hello After Exception");
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/aaa.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                double num =  scanner.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello from after Exception");
    }
}