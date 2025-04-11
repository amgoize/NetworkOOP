package main.model.hardware;

import java.util.ArrayList;
import java.util.List;

public class HDD extends HardwareElement{
    private int size;
    private List<Partition> partitions;

    public HDD(String name, int size) {
        super(name);
        this.size = size;
        this.partitions = new ArrayList<>();
    }

    public void addPartition(Partition partition) {
        // Передаём индекс = текущему размеру списка (0, 1, 2...)
        partitions.add(new Partition(partition.getName(), partition.getSize(), partition.getLabel(), partitions.size()));
    }

    @Override
    public void printInfo(String prefix, boolean isLast) {
        System.out.println(prefix + (isLast ? "\\-" : "+-") + "HDD, " + size + " GiB");

        // Новый префикс для разделов
        String partitionPrefix = prefix + (isLast ? "    " : "|   ");

        for (int i = 0; i < partitions.size(); i++) {
            boolean partitionIsLast = (i == partitions.size() - 1);
            partitions.get(i).printInfo(partitionPrefix, partitionIsLast);
        }
    }
}
