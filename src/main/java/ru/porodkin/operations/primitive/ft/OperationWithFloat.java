package ru.porodkin.operations.primitive.ft;

import ru.porodkin.operations.AbstractOperation;

import java.util.List;

public abstract class OperationWithFloat extends AbstractOperation<Float> {
    public OperationWithFloat(List<Float> variables) {
        super(variables);
    }

    @Override
    public Float invoke() {
        return invokeOperation();
    }
}
