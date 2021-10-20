package laba10.ChairFactory;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("Avada Kedavra!");
    }
    @Override
    public void sitOn() {
        System.out.print("Lord Voldemort sits in throne and says: ");
        doMagic();
    }
}
