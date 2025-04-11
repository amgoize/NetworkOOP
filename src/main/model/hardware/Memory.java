package main.model.hardware;

public class Memory extends HardwareElement{
    private int size; // размер в MB

    public Memory(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void printInfo(String prefix, boolean isLast) {
        System.out.println(prefix + (isLast ? "\\-" : "+-") + "Memory, " + size + " MiB");
    }

}
