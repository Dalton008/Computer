public class Processor {
    private final double frequency;
    private final int numberOfCores;
    private final int manufacturer;
    private final int weight;

    public Processor(double frequency, int numberOfCores, int manufacturer, int weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public Processor setFrequency(int frequency) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public Processor setNumberOfCores(int numberOfCores) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public Processor setManufacturer(int manufacturer) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    public Processor setWeight(int weight) {
        return new Processor(frequency, numberOfCores, manufacturer, weight);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", numberOfCores=" + numberOfCores +
                ", manufacturer=" + manufacturer +
                ", weight=" + weight +
                '}';
    }
}
