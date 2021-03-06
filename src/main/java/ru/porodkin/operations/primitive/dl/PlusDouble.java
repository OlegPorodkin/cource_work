package ru.porodkin.operations.primitive.dl;

import java.util.List;

public final class PlusDouble extends OperationWithDouble {

    public PlusDouble(List<Double> variables) {
        super(variables);
    }

    @Override
    protected Double invokeOperation() {

        double varResult = variables.get(0);
        for (int i = 1; i < variables.size(); i++) {
            Double var = variables.get(i);
            varResult += var;
        }

        return varResult;
    }
}
