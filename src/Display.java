public class Display {
    private final int diagonal;
    private final DisplayType type;
    private final int weight;

    public Display(int diagonal, DisplayType type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public DisplayType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public Display setDiagonal(int diagonal) {
        return new Display(diagonal, type, weight);
    }

    public Display setType(DisplayType type) {
        return new Display(diagonal, type, weight);
    }

    public Display setWeight(int weight) {
        return new Display(diagonal, type, weight);
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
