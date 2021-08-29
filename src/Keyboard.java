public class Keyboard {
    private final KeyboardType type;
    private final KeyboardIllumination illumination;
    private final int weight;

    public Keyboard(KeyboardType type, KeyboardIllumination illumination, int weight) {
        this.type = type;
        this.illumination = illumination;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public KeyboardIllumination isIllumination() {
        return illumination;
    }

    public int getWeight() {
        return weight;
    }

    public Keyboard setType(KeyboardType type) {
        return new Keyboard(type, illumination, weight);
    }

    public Keyboard setKeyboardIllumination(KeyboardIllumination illumination) {
        return new Keyboard(type, illumination, weight);
    }

    public Keyboard setWeight(int weight) {
        return new Keyboard(type, illumination, weight);
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type=" + type +
                ", illumination=" + illumination +
                ", weight=" + weight +
                '}';
    }
}
