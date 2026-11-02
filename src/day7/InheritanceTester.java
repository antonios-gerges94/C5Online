package day7;

public class InheritanceTester {
    public static void main(String[] args) {
//        Mother mother =  new Mother();
        Parent obj = new Child();
        obj.show("100");                             // Runtime Polymorphism (Dynamic Binding)
//        obj.show(100);                   // Compile Polymorphism (Static Binding)
    }
}
