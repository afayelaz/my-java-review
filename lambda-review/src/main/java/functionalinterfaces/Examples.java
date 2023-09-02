package functionalinterfaces;

import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args) {

            //JAVA READY APIs Funct Interfaces

        //****PREDICATE******///
        // test(parameter) method


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



    }



}
