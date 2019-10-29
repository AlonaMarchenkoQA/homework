package com.playtika.courses.homework9;

import java.util.*;

public class ArrayStack<E> extends AbstractCollection<E> implements Stack<E> {

    private Object[] data = new Object[2];
    private int elementsCount = 0;

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    @Override
    public int size() {
        return elementsCount;
    }

    @Override
    public void push(E element) {
        checkAndUpdateArraySize();
        data[elementsCount] = element;
        elementsCount++;
    }

    @Override
    public E pop() {
        if (elementsCount == 0) {
            throw new EmptyStackException();
        }
        elementsCount--;
        E element = (E) data[elementsCount];
        data[elementsCount] = null;
        return element;
    }

    private void checkAndUpdateArraySize() {
        if (data.length == elementsCount) {
            int newSize = (int) (data.length * 1.5);
            data = Arrays.copyOf(data, newSize);
        }
    }


    private class StackIterator implements Iterator<E> {

        int cursor = elementsCount - 1;

        @Override
        public boolean hasNext() {
            return cursor >= 0;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            E element = (E) data[cursor];
            cursor--;
            return element;
        }
    }
}
