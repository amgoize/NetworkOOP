package main.model.hardware;

public abstract class HardwareElement {
    private String name;

    public HardwareElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printInfo(String prefix, boolean isLast);
}
