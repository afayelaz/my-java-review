package practise;

public class Ternaries2 {
    public static void main(String[] args) {

        int score = 75;

        char grade;

        if (score>=90 && score<=100) {
            grade = 'A';
//            System.out.println("A");
        } else if(score>=80 && score<90) {
            grade = 'B';
//            System.out.println("B");
        } else if(score>=70 && score<80) {
            grade = 'C';
//            System.out.println("C"+grade);
        } else if (score>=60 && score<70) {
            grade = 'D';
//            System.out.println("D");
        } else {
            grade = 'F';
//            System.out.println("F");
        }

        System.out.println(grade);

        System.out.println("----");

        char grade2 = (score>=90) ? 'A': (score >=80) ? 'B': (score >=70) ? 'C': (score>60) ? 'D' : 'F';
        System.out.println(grade2);



    }


}
