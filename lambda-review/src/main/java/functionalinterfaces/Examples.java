package functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args) {

            //JAVA READY APIs - Functional Interfaces

        //****PREDICATE******///
        // boolean test(T t);
        // test(parameter) method - return exist
        // most frequent - need to check tremendous - so will use


    //Anonymous way
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//
//        lesserThan.test(50);

//      Predicate<Integer> lesserThan =  public boolean abc(Integer a){ return a<18}; // impl_of test method
        Predicate<Integer> lesserThan =  a ->  a<18; // impl_of test method that belongs to Predicate Interface
        System.out.println(lesserThan.test(50));
//        java 101 way
//        Boolean result = lesserThan.test(50);
//        System.out.println(result);

        ///****CONSUMER******
        // lambda method -- interface - 1 method exact match - JAVA Ready FI
        // void accept(T t)
        // accept()  void method no return

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);

        // double column -- BEtter way on the way
//        Consumer<Integer> display1 = System.out::println;
//        display1.accept(50);







    }



}
