package main.model.network;

public class IPAddress extends NetworkElement {

    private String ip;

    public IPAddress(String ip) {
        super(ip);  // Используем ip как имя в родительский конструктор
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public void printInfo(String prefix, boolean isLast) {
        // Печатаем информацию о IP-адресе
        System.out.println(prefix + (isLast ? "  " : "+-") + ip);
    }

    @Override
    public String toString() {
        return ip;
    }

}
