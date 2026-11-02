package day7;

public class Child extends Parent {

    @Override
    public void show(String s){
        System.out.println("Child String");
    }                                              // Runtime Polymorphism (Dynamic Binding) : has (String s) like the parent (Override)

//    public void show(Integer s){
//        System.out.println("Child Integer");
//    }                                            // Compile Polymorphism (Static Binding) : based on the reference (left side) , (Overload)
                                                   // has (Integer s) different from the parent

}
