import java.util.ArrayList;

public class ArrayListExample {

    // generic is type checking

    public static void main(String[] args) {

//        ArrayList items = new ArrayList(); // Object - apple object add not given compile error

        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

//        //ArrayList items = new ArrayList();
//        // no compile error - run error. String cannot be cast
//        items.add("apple");

        // ArrayList<Integer> items = new ArrayList<Integer>();
        // compile error
//        items.add("apple"); // commented due to error

        printDouble(items);

    }
    //        //ArrayList items = new ArrayList();
//    private static void printDouble(ArrayList items) {

//        for (Object i: items) {
////            System.out.println(i*2); // complain because object time integer not make sense
//            System.out.println((Integer)i*2); // casted Integer
//        }

        // ArrayList<Integer> items = new ArrayList<Integer>();
        private static void printDouble(ArrayList<Integer> items) {
            for(int i : items) {
                System.out.println(i*2);

        }

    }

}
