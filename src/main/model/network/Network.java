package main.model.network;

import java.util.ArrayList;
import java.util.List;

public class Network extends NetworkElement{
    private String name;
    private List<NetworkElement> elements;

    public Network(String name) {
        super(name);
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void addElement(NetworkElement element) {
        elements.add(element);
    }

    @Override
    public void printInfo(String prefix, boolean isLast) {
        // Для Network не выводим +- или \- в начале
        System.out.println(prefix + "Network: " + getName());

        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).printInfo(prefix + (isLast ? "  " : "| "), i == elements.size() - 1);
        }
    }

}
