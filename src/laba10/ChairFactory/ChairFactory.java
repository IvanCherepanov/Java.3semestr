package laba10.ChairFactory;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(25);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
