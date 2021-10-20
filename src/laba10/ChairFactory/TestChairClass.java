package laba10.ChairFactory;

public class TestChairClass {
    public static void main(String[] args) {
        Client client = new Client();
        AbstractChairFactory abstractChairFactory = new ChairFactory();

        Chair chair1 = abstractChairFactory.createFunctionalChair();
        Chair chair2 = abstractChairFactory.createMagicChair();
        Chair chair3 = abstractChairFactory.createVictorianChair();

        client.setChair(chair1);
        client.sit();

        client.setChair(chair2);
        client.sit();

        client.setChair(chair3);
        client.sit();


    }
}
