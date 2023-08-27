package apples;

import java.util.ArrayList;

public class AppleGreenCheck implements ApplePredicateCheck {


    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}


