import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Student> mySet = new HashSet<>();

        mySet.add(new Student(7,"Ibat"));
        mySet.add(new Student(8,"Teret"));
        mySet.add(new Student(9,"Baret"));
        // hashset and equals added Student class - the same id:9 not allow duplicates
        // implement hashset and equals always !!!!
        mySet.add(new Student(9,"Baret")); // Set not allow duplicates

        System.out.println(mySet);
        System.out.println("duplicate allow= " + mySet.add(new Student(8,"Teret")));


        Set<Integer> numSet = new HashSet<>();
        numSet.add(3);
        numSet.add(4);
        numSet.add(3);
        System.out.println(numSet);
        System.out.println("duplicate allow= " +numSet.add(4));

        String str = "Java Developer";
        System.out.println(str +" first repeating char: " +firstRepeatingChar(str) + " should be a");
    }

    // @firstRepeatingChar
    // returning firstRepeatingChar
    public static Character firstRepeatingChar(String str) {

        //Create a hasmap
        Set<Character> chars = new HashSet<>();
        //iteration
        for (Character ch : str.toCharArray()){
            if (!chars.add(ch)) {
                return ch;
            }
        }
       return null;
    }
}
