package ru.porodkin.operations;

import java.util.List;

public abstract class AbstractOperation<T extends Number> implements Operation<T> {
    protected List<T> variables;

    public AbstractOperation(List<T> variables) {
        this.variables = variables;
    }

    protected abstract T invokeOperation();
}
