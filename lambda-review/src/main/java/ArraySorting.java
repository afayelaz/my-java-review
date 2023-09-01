import java.sql.SQLOutput;

public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort(); // after Sorting interface method passed - method updated-commented

        QuickSort qs = new QuickSort(); // behaviour QuickSort
        as.sort(qs);
        BubbleSort bs = new BubbleSort(); // behaviour BubbleSort
        as.sort(bs);
        AbcSorting abcSorting = new AbcSorting();// behaviour abcSort
        as.sort(abcSorting);
        XyzSorting xyzSorting = new XyzSorting();// behaviour xyzSort
        as.sort(xyzSorting);


        //Lambda Steps example
        //created MyLambda interface
        //        interface MyLambda {
        //            void print();
        //        }
        // have to exactly match same signature with the method () <> ()
//        MyLambda myLambda = () -> System.out.println("Sorting the array") ;
        //can remove the MyLambda interface// Already sorting do the same
        //Java ReadyAPI interfaces

//        MyLambda myLambda = () -> System.out.println("Sorting the array"); // the same signature
//        Sorting myLambda2 = () -> System.out.println("Sorting the array"); // it works no need myLamda interface - the same signature
        //@FunctionalInterface


//        System.out.println("*******");
//        Sorting noLambda = new QuickSort();
//        noLambda.sort();

        // !!! 1- need to create Interface (not skip the interface) !!!2- you need match same method sign
        // !! skipped the implementation class - BubbleSort --> middle skipped. Functional Programming

        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble sorting");
        as.sort(bubbleSort);

//        ********Lambda
//        public void sort (action) {
//                action();
//        }
        // behavior parameterization  via Lambda
        as.sort(() -> System.out.println("Bubble sorting"));


//        Type Inference:
//        StringLengthLambda myLambda = s -> s.length // compiler understand String
//        weightApple = apple -> apple.getWeight()>150;


    }
    // Sorting Array Method -- only 1 job
    // if need more than 1 job need add all conditions
//    private void sort() {
//        System.out.println("Sorting Array");
//    }

    // Quick Sorting Array Method -- only 1 job
    // if need more than 1 job need add all conditions
//    private void sort() {
//        System.out.println("Quick Sorting Array");
//    }


        //Sorting interface passing
        // Quick Sort or Bubble Sort --2 sort classes added and implements Sorting interface
        // sort() method Different behaviour
//    private void sort(Sorting sorting) {
//        sorting.sort();
//
//    }

    //*** Added two more behaviour via AbcSorting and  XyzSorting classes

    //Sorting interface passing
    // Quick Sort,Bubble Sort, Abc Sorting, Xyz Sorting
    // 2 sort classes added and implements Sorting interface
    // sort() method Different behaviour
    private void sort(Sorting sorting) {
        sorting.sort();

    }
//
//    interface MyLambda {
//        void print();
//    }


}
