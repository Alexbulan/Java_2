package ru.mirea.it.ivbo;

public class Subtract extends Operator{
    public Subtract(Argument numL, Argument numR) {
        super(numL, numR);
    }

    public Subtract(Argument numL, Variable numRv) {
        super(numL, numRv);
    }

    public Subtract(Variable numLv, Variable numRv) {
        super(numLv, numRv);
    }

    public Subtract(Variable numLv, Argument numR) {
        super(numLv, numR);
    }
    @Override
    public double getNum() {
        return numL.getNum() - numR.getNum();
    }
}
