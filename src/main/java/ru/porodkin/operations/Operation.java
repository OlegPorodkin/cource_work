package ru.porodkin.operations;


public interface Operation<T extends Number> {
    T invoke();
}
