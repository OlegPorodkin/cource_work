package ru.porodkin.operations.primitive.ir;

import ru.porodkin.operations.AbstractOperation;

import java.util.List;

public abstract class OperationWithInteger extends AbstractOperation<Integer> {
    public OperationWithInteger(List<Integer> variables) {
        super(variables);
    }

    @Override
    public Integer invoke() {
        return invokeOperation();
    }
}
