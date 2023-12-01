package ru.mirea.it.ivbo;

public class Operator extends Argument{
    protected Argument numL, numR;
    protected Variable numLv, numRv;
    public Operator(Argument numL, Argument numR){
        this.numL = numL;
        this.numR = numR;
    }

    public Operator(Argument numL, Variable numRv) {
        this.numL = numL;
        this.numRv = numRv;
    }

    public Operator (Variable numLv, Argument numR){
        this.numLv = numLv;
        this.numR = numR;
    }

    public Operator(Variable numLv, Variable numRv) {
        this.numLv = numLv;
        this.numRv = numRv;
    }

    public double analyze(double num){
        if(numR == null) numR = numRv.toConst(num);
        if(numL == null) numL = numLv.toConst(num);
        if(numL instanceof Operator) ((Operator) numL).analyze(num);
        if(numR instanceof Operator)((Operator) numR).analyze(num);
        return getNum();
    }
}
