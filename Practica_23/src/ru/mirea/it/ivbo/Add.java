package ru.mirea.it.ivbo;

public class Add extends Operator{
    public Add(Argument numL, Argument numR) {
        super(numL, numR);
    }

    public Add(Argument numL, Variable numRv) {
        super(numL, numRv);
    }

    public Add(Variable numLv, Argument numR) {
        super(numLv, numR);
    }

    public Add(Variable numLv, Variable numRv) {
        super(numLv, numRv);
    }

    @Override
    public double getNum() {
        return numL.getNum() + numR.getNum();
    }
}
