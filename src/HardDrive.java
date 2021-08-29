public class HardDrive {
    private final HDType type;
    private final int memoryCapacity;
    private final int weight;

    public HardDrive(HDType type, int memoryCapacity, int weight) {
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public HDType getType() {
        return type;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public HardDrive setType(HDType type) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    public HardDrive setMemoryCapacity(int memoryCapacity) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    public HardDrive setWeight(int weight) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "type=" + type +
                ", memoryCapacity=" + memoryCapacity +
                ", weight=" + weight +
                '}';
    }
}
