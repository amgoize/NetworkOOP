package main.model.hardware;

public class Partition extends HardwareElement{
    private int size;
    private String label;
    private int index;

    public Partition(String name, int size, String label, int index) {
        super(name);
        this.size = size;
        this.label = label;
        this.index = index;
    }

    public Partition(String name, int size, String label) {
        super(name);
        this.size = size;
        this.label = label;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void printInfo(String prefix, boolean isLast) {
        System.out.println(prefix + (isLast ? "\\-" : "+-") +
                "[" + index + "]: " + size + " GiB, " + label.toLowerCase());
    }
}
