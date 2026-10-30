package day5;

import java.util.Scanner;

public class Grades {
        private static int [] grades;
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {

            System.out.println("Enter the number of grades ");
//        int numberOfGrades =
            grades = new int[scanner.nextInt()];
            getGrades();
            printGrades();
            System.out.println("The average grade is " + String.format("%.2f",calculateAverage()));
            System.out.println("The highest grade is " + getHighest());
            System.out.println("The lowest grade is " + getLowest());
        }
        public static void getGrades(){
            for (int i=0;i< grades.length;i++){
                System.out.println("Enter grade "+(i+1));
                grades[i]=scanner.nextInt();
            }
        }
        public static void printGrades(){
            for (int grade:grades){
                System.out.println(grade);
            }
    }
    public static double calculateAverage(){
           return calculateSum()/ grades.length;
    }
    public static int calculateSum(){
        int total=0;
            for (int grade:grades){
            System.out.println(grade);
            total+=grade;
        }
            return total;
    }
    public static int getHighest(){
        int highest=grades[0];
        for (int grade:grades){
            if(grade>highest){
                highest=grade;
            }
        }
        return highest;
    }
    public static int getLowest(){
        int lowest=grades[0];
        for (int grade:grades){
            if(grade<lowest){
                lowest=grade;
            }
        }
        return lowest;
    }
}
