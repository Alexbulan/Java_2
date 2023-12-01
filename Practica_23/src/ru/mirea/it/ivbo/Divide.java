package ru.mirea.it.ivbo;

public class Divide extends Operator{

    public Divide(Argument numL, Argument numR) {
        super(numL, numR);
    }

    public Divide(Argument numL, Variable numRv) {
        super(numL, numRv);
    }

    public Divide(Variable numLv, Argument numR) {
        super(numLv, numR);
    }

    public Divide(Variable numLv, Variable numRv) {
        super(numLv, numRv);
    }

    @Override
    public double getNum() {
        return numL.getNum() / numR.getNum();
    }
}
