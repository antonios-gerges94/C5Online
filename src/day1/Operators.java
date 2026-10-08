package day1;

import jdk.jfr.Relational;

import javax.management.relation.RelationException;

public class Operators {
    public static void main(String[] args) {

////        Arithmetic Operators
//        int a = 20 , b = 10;
//        System.out.println("The addition of a and b is " + (a + b));
//        System.out.println("The substraction of a and b is " + (a - b));
//        System.out.println("The multiplication of a and b is " + (a * b));
//        System.out.println("The division of a and b is " + (a / b));
//        System.out.println("The remainder of a and b is " + (a % b));
//    }

////    Relational/Comparison Operators
//
//        int a = 20 , b = 10;
//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);
//    }

    //    Logical Operators  &&  ||  !

//    boolean x=true, y=false;
//        System.out.println(x&&y);
//        System.out.println(x||y);
//        System.out.println(!x);
//        System.out.println(!y);

//        int a = 10;
//        int b = --a;
//        System.out.println(a);
//        System.out.println(b);


//        int a=5;
//        a+=5;     // a=a+5
//        a-=5;     // a=a-5
//        a*=5;     // a=a*5
//        a/=5;     // a=a/5
//        a%=5;     // a=a%5
//
//        System.out.println(a);

        int age = 12;
////        var = exp ? true : false
        String status = age>18?"Eligible":"Not Eligible";
//        System.out.println(status);
//

        if(age>18){
            status = "Eligible";
        }
        else {
            status = "Not Eligible";
        }

        System.out.println(status);
    }
}
