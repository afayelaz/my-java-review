package practise;

public class PrimitiveCastings {

    public static void main(String[] args) {
        //implicit casting
        int a = 100;
        double b=  a; // auto casting implicit (double) a not needed.
        System.out.println(a);
        System.out.println(b);

        //explicit casting
        double x = 20.5;
        int y = (int) x; // have to (int) manually add
        System.out.println(x);
        System.out.println(y);
    }
}
