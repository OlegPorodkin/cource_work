package ru.porodkin.operations.primitive.dl;

import ru.porodkin.operations.AbstractOperation;

import java.util.List;

public abstract class OperationWithDouble extends AbstractOperation<Double> {
    public OperationWithDouble(List<Double> variables) {
        super(variables);
    }

    @Override
    public Double invoke() {
        return invokeOperation();
    }
}
