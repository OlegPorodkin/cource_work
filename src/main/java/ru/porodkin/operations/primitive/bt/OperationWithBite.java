package ru.porodkin.operations.primitive.bt;

import ru.porodkin.operations.AbstractOperation;

import java.util.List;

public abstract class OperationWithBite extends AbstractOperation<Byte> {

    public OperationWithBite(List<Byte> variables) {
        super(variables);
    }

    @Override
    public Byte invoke() {
        return invokeOperation();
    }
}
