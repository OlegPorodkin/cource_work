package ru.porodkin.operations.primitive.lg;

import java.util.List;

public final class DivideLong extends OperationWithLong {

    public DivideLong(List<Long> variables) {
        super(variables);
    }

    @Override
    protected Long invokeOperation() {

        long varResult = variables.get(0);
        for (int i = 1; i < variables.size(); i++) {
            Long var = variables.get(i);
            varResult /= var;
        }

        return varResult;
    }
}
