package ru.porodkin.operations.primitive.ft;

import java.util.List;

public final class PlusFloat extends OperationWithFloat {

    public PlusFloat(List<Float> variables) {
        super(variables);
    }

    @Override
    protected Float invokeOperation() {

        float varResult = variables.get(0);
        for (int i = 1; i < variables.size(); i++) {
            Float var = variables.get(i);
            varResult += var;
        }

        return varResult;
    }
}
