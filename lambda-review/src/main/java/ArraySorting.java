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
        Sorting myLambda2 = () -> System.out.println("Sorting the array");

        //ready interface javaAPI

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
