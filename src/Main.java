import main.model.hardware.CPU;
import main.model.hardware.HDD;
import main.model.hardware.Memory;
import main.model.hardware.Partition;
import main.model.network.Host;
import main.model.network.IPAddress;
import main.model.network.Network;

public class Main {
    public static void main(String[] args) {
        IPAddress ip1 = new IPAddress("192.168.1.1");
        IPAddress ip2 = new IPAddress("10.0.0.1");

        Host host1 = new Host("server1.misis.ru", ip1);
        Host host2 = new Host("server2.misis.ru", ip2);

        host1.addElement(new CPU("Intel i7", 4, 2500));
        host1.addElement(new Memory("16GB RAM", 16000));

        host2.addElement(new CPU("Intel Xeon", 8, 3200));

        HDD hdd1 = new HDD("Main HDD", 2000);
        hdd1.addPartition(new Partition("system", 500, "System"));
        hdd1.addPartition(new Partition("data", 1500, "Data"));
        host2.addElement(hdd1);

        Network network = new Network("MISIS network");
        network.addElement(host1);
        network.addElement(host2);

        network.printInfo("", true);
    }
}