package ru.porodkin.operations.primitive.ir;

import java.util.List;

public final class MultiplyInteger extends OperationWithInteger {

    public MultiplyInteger(List<Integer> variables) {
        super(variables);
    }

    @Override
    protected Integer invokeOperation() {

        int varResult = variables.get(0);
        for (int i = 1; i < variables.size(); i++) {
            Integer var = variables.get(i);
            varResult *= var;
        }

        return varResult;
    }
}
