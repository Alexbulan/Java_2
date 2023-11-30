package ru.mirea.it.ivbo;

public class ChairFactory implements AbstractChairFactory{

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(7);
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
