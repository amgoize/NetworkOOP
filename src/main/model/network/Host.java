package main.model.network;


import main.model.hardware.HardwareElement;

import java.util.ArrayList;
import java.util.List;

public class Host extends NetworkElement{
    private IPAddress ipAddress;
    private List<HardwareElement> elements;

    public Host(String name, IPAddress ipAddress) {
        super(name);
        this.ipAddress = ipAddress;
        this.elements = new ArrayList<>();
    }

    public IPAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IPAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void addElement(HardwareElement element) {
        elements.add(element);
    }

    @Override
    public void printInfo(String prefix, boolean isLast) {
        System.out.println(prefix + (isLast ? "\\-" : "+-") + "Host: " + getName());

        // Выводим IP-адрес
        if (ipAddress != null) {
            ipAddress.printInfo(prefix + (isLast ? "  " : "| "), elements.isEmpty());
        }

        // Выводим остальные элементы
        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).printInfo(prefix + (isLast ? "  " : "| "), i == elements.size() - 1);
        }
    }

    public String getName() {
        return super.getName();
    }
}
