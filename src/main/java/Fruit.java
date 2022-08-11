public class Fruit {

    private FruitName title;
    private Color color;
    private int weight;

    public Fruit(FruitName title, Color color, int weight) {
        this.title = title;
        this.color = color;
        this.weight = weight;
    }

    public FruitName getTitle() {
        return title;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
