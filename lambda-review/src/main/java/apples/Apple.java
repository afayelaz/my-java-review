package apples;

public class Apple {

    private int weight;
    private Color Color;

    public Apple(int weight, apples.Color color) {
        this.weight = weight;
        Color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public apples.Color getColor() {
        return Color;
    }

    public void setColor(apples.Color color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", Color=" + Color +
                '}';
    }
}



