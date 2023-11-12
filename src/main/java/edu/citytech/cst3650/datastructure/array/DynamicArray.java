package edu.citytech.cst3650.datastructure.array;

import edu.learning.datatructure.java17.facade.AbstractList;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;

import static edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper.allocateMoreData;
public class DynamicArray<T extends Comparable<T>> extends AbstractList<T> {


    public DynamicArray(IntFunction<T[]> intFunction) {
        super.items = intFunction.apply(super.allocatedSize);
        super.intFunction = intFunction;
    }

    public DynamicArray(IntFunction<T[]> intFunction, int size) {
        if (size == 0)
            size = super.allocatedSize;

        super.allocatedSize = size;
        super.items = intFunction.apply(size);
        super.intFunction = intFunction;
        super.index = 0;
    }



    @Override
    public boolean add(T item) {


        if (size() >= super.allocatedSize) {

            if (super.allocatedSize == 0) {
                super.allocatedSize = 1;
            } else {
                super.allocatedSize = allocatedSize * 2;
            }

            super.items = allocateMoreData(super.intFunction, super.items, super.allocatedSize);
        }

        super.items[super.index++] = item;
        super.incrementSize();

        return true;

    }

    @Override
    public Optional<T> get(int index) {

        Optional<T> optional = Optional.empty();

        if (size() > index)
            optional = Optional.of(items[index]);

        return optional;
    }

    @Override
    public T[] toArray() {
        T[] data = intFunction.apply(size());

        for (int i = 0; i < data.length; i++) {
            data[i] = super.items[i];
        }

        return data;
    }

    @Override
    public void removeAll() {
        this.items = this.intFunction.apply(0);
        this.resetSize();
        this.allocatedSize = 0;
        this.index = 0;
    }

    @Override
    public String toString() {
        return ArrayUtilityHelper.toString(this.toArray());
    }

    @Override
    public T removeAt(int index) {
        T deleteItem = items[index];
        items = ArrayUtilityHelper.removeByIndex(super.intFunction, items, index);
        decrementSize();
        return items[index];
    }

    // T3_removeFrist - 10 test
    @Override
    public T removeFirst() {
        T firstItem = items[0];

        items = ArrayUtilityHelper.removeByIndex(super.intFunction, items, 0);
        decrementSize();

        return firstItem;
    }

    // T4_removeLast - 10 test
    @Override
    public T removeLast() {
        T lastItem = items[items.length - 1];
        items = ArrayUtilityHelper.removeByIndex(super.intFunction, items, index);
        decrementSize();
        return lastItem;
    }

    // T5_Remove - 10 test
    @Override
    public boolean remove(T data) {
       int index = -1;

       for (int i = 0; i < items.length; i++){
           if (items[i].equals(data)){
               index = i;
               break;
           }
       }
       if (index == -1){
           return false;
       }

       items = ArrayUtilityHelper.removeByIndex(super.intFunction, items, index);
       decrementSize();
       return true;
    }

    @Override
    public void max(BiConsumer<Integer, T> consumer) {
        if (items.length == 0) {
            return; // will handle empty array case
        }

        int maxIndex = 0;
        T maxValue = items[0];
        int length = super.size();

        for (int i = 1; i < length; i++) {
            T value = items[i];

            if (value instanceof Comparable) {
                Comparable<T> comparableValue = (Comparable<T>) value;

                if (comparableValue.compareTo(maxValue) > 0) {
                    maxValue = value;
                    maxIndex = i;
                }
            }
        }
        consumer.accept(maxIndex, maxValue);
    }

    @Override
    public void min(BiConsumer<Integer, T> consumer) {
        if (items.length == 0) {
            return; // will handle empty array case
        }

        int minIndex = 0;
        T minValue = items[0];
        int length = size();

        for (int i = 1; i < length; i++) {
            T value = items[i];

            if (value.compareTo(minValue) < 0) {
                minValue = value;
                minIndex = i;
            }
        }
        consumer.accept(minIndex, minValue);
    }

}
