package ru.porodkin.operations.primitive.bt;

import java.util.List;

public final class MultiplyByte extends OperationWithBite {

    public MultiplyByte(List<Byte> variables) {
        super(variables);
    }

    @Override
    protected Byte invokeOperation() {

        byte varResult = variables.get(0);
        for (int i = 1; i < variables.size(); i++) {
            Byte var = variables.get(i);
            varResult *= var;
        }

        return varResult;
    }
}
