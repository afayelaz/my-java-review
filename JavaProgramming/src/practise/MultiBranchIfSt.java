package practise;

public class MultiBranchIfSt {
    public static void main(String[] args) {
        int number = 10;

        if (number >0) {
            System.out.println("Positive");
        } else if (number <0 ){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        int score = 75;

        char grade;

        if (score>=90 && score<=100) {
            grade = 'A';
            System.out.println("A");
        } else if(score>=80 && score<90) {
            grade = 'B';
            System.out.println("B");
        } else if(score>=70 && score<80) {
            grade = 'C';
            System.out.println("C"+grade);
        } else if (score>=60 && score<70) {
            grade = 'D';
            System.out.println("D");
        } else {
            grade = 'F';
            System.out.println("F");
        }





    }


}
