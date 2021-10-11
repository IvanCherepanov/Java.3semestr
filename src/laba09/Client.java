package laba09;

public class Client {
    private String INN;
    private String name;

    public Client(String INN, String name) {
        this.INN = INN;
        this.name = name;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
