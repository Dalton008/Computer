public class Computer {
    private Processor processor;
    private RAMMemory ramMemory;
    private HardDrive hardDrive;
    private Display display;
    private Keyboard keyboard;

    private final int vendor;
    private final String name;

    public Computer(int vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public int totalWeight() {
        return processor.getWeight() +
                ramMemory.getWeight() +
                hardDrive.getWeight() +
                display.getWeight() +
                keyboard.getWeight();
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRamMemory(RAMMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\nprocessor=" + processor.toString() +
                ",\n ramMemory=" + ramMemory.toString() +
                ",\n hardDrive=" + hardDrive.toString() +
                ",\n display=" + display.toString() +
                ",\n keyboard=" + keyboard.toString() +
                ",\n vendor=" + vendor +
                ",\n name='" + name + '\'' +
                ",\n total weight= " + totalWeight() + '}';
    }
}
