public class RAMMemory {
    private final RAMMemoryType type;
    private final int volume;
    private final int weight;

    public RAMMemory(RAMMemoryType type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RAMMemoryType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public RAMMemory setType(RAMMemoryType type) {
        return new RAMMemory(type, volume, weight);
    }

    public RAMMemory setVolume(int volume) {
        return new RAMMemory(type, volume, weight);
    }

    public RAMMemory setWeight(int weight) {
        return new RAMMemory(type, volume, weight);
    }

    @Override
    public String toString() {
        return "RAMMemory{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
