package apples;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        // one method and behaviours

        List<Apple> heavyApple = filterApples(inventory,new AppleWeightCheck());
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory,new AppleGreenCheck());
        System.out.println(greenApple);


    }


    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicateCheck applePredicateCheck) {

        List<Apple> result = new ArrayList<>();

        for ( Apple apple : inventory) {
            if(applePredicateCheck.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
