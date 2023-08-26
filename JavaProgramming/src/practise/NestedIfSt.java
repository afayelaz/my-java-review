package practise;

public class NestedIfSt {
    public static void main(String[] args) {

        int score = 155;

        if ( score >= 0 && score<=100) { // pre-condition: if the score is valid

            if (score > 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else { // if the score is not valid
            System.out.println("Invalid score");
        }



    }

}
