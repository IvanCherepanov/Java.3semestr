package laba10.ChairFactory;

public class FunctionalChair implements  Chair{
    public int sum(int a, int b) { return a + b;}
    @Override
    public void sitOn() {
        System.out.println("Mathematics sits on throne and has a solution in mind " + sum(43243523,543543543));
    }
}
