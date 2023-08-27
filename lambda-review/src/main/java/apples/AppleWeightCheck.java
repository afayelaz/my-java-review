package apples;

public class AppleWeightCheck implements ApplePredicateCheck{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 200;
    }
}
