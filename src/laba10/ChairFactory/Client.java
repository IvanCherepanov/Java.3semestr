package laba10.ChairFactory;

/**
 * Клиентский код должен работать как с фабриками, так и с продуктами только через их общие интерфейсы.
 * Это позволит подавать в ваши классы любой тип фабрики и производить любые продукты, ничего не ломая.
 */
public class Client {
    public Chair chair;

    public void sit() {
        chair.sitOn();
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
