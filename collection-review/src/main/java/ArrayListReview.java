import java.util.*;

public class ArrayListReview {
    public static void main(String args[]) {
        // create ArrayList and a class
        List<Student> students = new ArrayList<>();
        //Add Elements to ArrayList
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));
        System.out.println(students);
        // Iteration on ArrayLists
        //1.For Loop with get(index)
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        // 2. iterator
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        // Forward iteration
        Iterator iterF = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //  Backward iteration
        System.out.println("backward iteration");
        Iterator iterB = students.listIterator();
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        // 3 For each loop
        System.out.println("for each");
        for (Student std : students) {
//            String a = std.name.toLowerCase();
            System.out.println(std);
//            System.out.println(a);
        }
//        // 4Lambda
//        System.out.println("lambda");
//        students.forEach(student -> System.out.println(student));

        //4Lambda Review
        System.out.println("Quick Flash Lambda Review");
        students.forEach(student -> System.out.println(student));

        // 5 Sorting Elements in List
        System.out.println("sorted list by comp - id desc");
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);
        System.out.println("sorted list by comp- name des");
        Collections.sort(students,new sortByIdDesc.sortByNameDesc());
        System.out.println(students);





    }
    static class sortByIdDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {

            return o2.id - o1.id;
        }
        static class sortByNameDesc implements Comparator<Student> {
            @Override
            public int compare(Student o1, Student o2) {

                return o2.name.compareToIgnoreCase(o1.name);
            }
        }
    }

    // lambda

//     public void printStuff (Student student) {
//            System.out.println(student.get(i));
//    }
    /*
    (student)->System.out.println(students().get(i));

    student -> System.out.println(student)
    */
}

