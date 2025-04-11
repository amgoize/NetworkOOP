package main.model.hardware;

public class CPU extends HardwareElement{
    private int cores;
    private int speed;

    public CPU(String name, int cores, int speed) {
        super(name);
        this.cores = cores;
        this.speed = speed;
    }

    @Override
    public void printInfo(String prefix, boolean isLast) {
        System.out.println(prefix + (isLast ? "\\-" : "+-") + "CPU, " + cores + " cores @ " + speed + "MHz");
    }
}
