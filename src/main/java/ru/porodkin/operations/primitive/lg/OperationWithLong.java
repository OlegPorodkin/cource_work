package ru.porodkin.operations.primitive.lg;

import ru.porodkin.operations.AbstractOperation;

import java.util.List;

public abstract class OperationWithLong extends AbstractOperation<Long> {
    public OperationWithLong(List<Long> variables) {
        super(variables);
    }

    @Override
    public Long invoke() {
        return invokeOperation();
    }
}
