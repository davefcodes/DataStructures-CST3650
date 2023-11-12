package edu.citytech.cst3650.datastructure.array;

import java.util.function.IntFunction;

public class ArrayUtilityHelper {
    public static <T> int size(T[]... items) {
        int length = 0;

        for (T[] x : items) {
            length += x.length;
        }
        return length;
    }

    public static Integer[] merge(Integer[]... items) {
        var results = new Integer[size(items)];
        return merge(Integer[]::new, items);
    }

    public static <T> T[] merge(IntFunction<T[]> intFunction, T[]... items) {
        T[] results = intFunction.apply(size(items));
        int i = 0;
        for (T[] ts : items) {
            for (T t : ts) {
                results[i++] = t;
            }
        }
        return results;
    }


    public static String[] merge(String[]... items) {
        return merge(String[]::new, items);
    }

    public static <T> T[] copyRange(IntFunction<T[]> intFunction, T[] data, int start, int end) {
        int newSize = end - start + 1;
        T[] newData = intFunction.apply(newSize);

        for (int i = start, n = 0; i <= end; i++) {
            newData[n++] = data[i];
        }

        return newData;
    }

    public static <T> String toString(T[] items) {
        StringBuilder sb = new StringBuilder();

        int size = size(items), count = 0;

        sb.append("Content size is: ");
        sb.append(size);
        sb.append(" content: [");

        String delimiter = ", ";

        for (T t : items) {
            count++;

            if (count > size) break;
            else if (count > size - 1) {
                delimiter = "";
            }
            sb.append(t);
            sb.append(delimiter);
        }

        sb.append("]");
        return sb.toString();

    }

    public static <T> T[] removeByIndex(IntFunction<T[]> intFunction, T[] data, int index) {
        T[] newData = intFunction.apply(data.length - 1);

        for (int i = 0, x = 0; i < data.length; i++) {
            boolean status = i == index;

            if (!status) {
                newData[x++] = data[i];
            }
        }
        return newData;
    }

    // Finish functions
//    public static <T> Integer removeByIndexes(Integer[] intFunction, T[] data, int index, int indexTwo, int indexThree) {
//
//
//        return null;
//
//    }

    public static <T> T[] allocateMoreData(IntFunction<T[]> intFunction, T[]data, int newSize, T...newItems){

        int emptyElementSize = newSize - (newItems.length + data.length);
        T[] emptyItems = intFunction.apply(emptyElementSize);
        T[] newData = merge(intFunction, data, newItems, emptyItems);

        return newData;
    }


}


