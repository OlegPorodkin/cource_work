package ru.porodkin.operations.primitive.sh;

import ru.porodkin.operations.AbstractOperation;

import java.util.List;

public abstract class OperationWithShort extends AbstractOperation<Short> {
    public OperationWithShort(List<Short> variables) {
        super(variables);
    }

    @Override
    public Short invoke() {
        return invokeOperation();
    }
}
