package ru.mirea.it.ivbo;

public class Multiply extends Operator{
    public Multiply(Argument numL, Argument numR) {
        super(numL, numR);
    }

    public Multiply(Argument numL, Variable numRv) {
        super(numL, numRv);
    }

    public Multiply(Variable numLv, Variable numRv) {
        super(numLv, numRv);
    }

    public Multiply(Variable numLv, Argument numR) {
        super(numLv, numR);
    }
    @Override
    public double getNum() {
        return numL.getNum() * numR.getNum();
    }
}
