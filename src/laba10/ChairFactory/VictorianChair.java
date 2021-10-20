package laba10.ChairFactory;

public class VictorianChair implements Chair{
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sitOn() {
        System.out.println("King sits in throne for" + getAge() +" years");
    }
}
