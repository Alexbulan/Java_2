package ru.mirea.it.ivbo;

public class Computer {
    private final Processor processor = new Processor(Brands.INTEL, 64, 3);
    private final Memory memory = new Memory(Brands.AMD, 512, 2000, 154);
    private final Monitor monitor = new Monitor(Brands.LG, 120);

    public void print(){
        System.out.println("SPECIFICATIONS:");
        System.out.println("  of processor:" +
                 "\n   1. Brand - " + processor.getBrand() +
                 "\n   2. Count of cores - " + processor.getCores() +
                 "\n   3. Frequency - " + processor.getFrequency()
        );
        System.out.println("  of memory:" +
                "\n   1. Brand - " + memory.getBrand() +
                "\n   2. Capacity - " + memory.getCapacity() +
                "\n   3. Frequency - " + memory.getFrequency() +
                "\n   4. Vacant space - " + memory.getVacant_space()
        );
        System.out.println("  of monitor:" +
                "\n   1. Brand - " + monitor.getBrand() +
                "\n   2. Frequency - " + monitor.getFrequency()
        );
    }
}
