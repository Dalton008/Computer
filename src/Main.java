public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(3.6, 4, 1200, 200);
        RAMMemory ramMemory = new RAMMemory(RAMMemoryType.DDR4, 2400, 300);
        HardDrive hardDrive = new HardDrive(HDType.SDD, 500, 500);
        Display display = new Display(24, DisplayType.IPS, 1500);
        Keyboard keyboard = new Keyboard(KeyboardType.MECHANICAL_KEYBOARD, KeyboardIllumination.YES, 800);

        Computer computer = new Computer(4000, "Computer1");
        computer.setProcessor(processor);
        computer.setRamMemory(ramMemory);
        computer.setHardDrive(hardDrive);
        computer.setDisplay(display);
        computer.setKeyboard(keyboard);

        System.out.println(computer.toString());
    }
}
