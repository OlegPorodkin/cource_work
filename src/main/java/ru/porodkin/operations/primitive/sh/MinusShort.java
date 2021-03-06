package ru.porodkin.operations.primitive.sh;

import java.util.List;

public final class MinusShort extends OperationWithShort {
    public MinusShort(List<Short> variables) {
        super(variables);
    }

    @Override
    protected Short invokeOperation() {

        short varResult = variables.get(0);
        for (int i = 1; i < variables.size(); i++) {
            Short var = variables.get(i);
            varResult -= var;
        }

        return varResult;
    }
}
