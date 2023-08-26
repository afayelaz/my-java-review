package practise;

public class UnaryOps {
    public static void main(String[] args) {
        // + , ++
        // - , --

        //pre --
    int x = 10;
    int y =100;
        System.out.println(++x);
        System.out.println(--y);

        //post

        System.out.println(x++); //ops in order first print 10 then increment 1
        System.out.println(x); // x value increment so print 11
        System.out.println(y--);

    }
}
