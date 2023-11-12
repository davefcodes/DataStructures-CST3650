package edu.citytech.cst3650.datastructure.csv;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class T4_DynamicArrayRemoveLast {

    @Test
    @DisplayName("1 remove last")
    public void t1_removeLast(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(4, 5, 6, 7);

        da.removeLast();

        int expected = 6;
        Optional<Integer> actualOpt = da.get(da.size() -1 );
        int actual = actualOpt.get();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("2 remove last")
    public void t2_removeLast(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");

        da.removeLast();

        String expected = "b";
        Optional<String> actualOpt = da.get(da.size() -1 );
        String actual = actualOpt.get();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("3 remove last")
    public void t3_removeLast(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4);

        da.removeLast();

        int expected = 3;
        Optional<Integer> actualOpt = da.get(da.size() -1 );
        int actual = actualOpt.get();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("4 remove last")
    public void t4_removeLast(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c", "d");

        da.removeLast();

        String expected = "c";
        Optional<String> actualOpt = da.get(da.size() -1 );
        String actual = actualOpt.get();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("5 remove last")
    public void t5_removeLast(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");

        da.removeLast();

        int expected = 2;
        int actual = da.size();

        assertEquals(expected, actual);

    }


    @Test
    @DisplayName("6 remove last")
    public void t6_removeLast(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c", "d");

        da.removeLast();

        int expected = 3;
        int actual = da.size();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("7 remove last")
    public void t7_removeLast(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b");

        da.removeLast();

        String expected = "a";
        Optional<String> actualOpt = da.get(da.size() -1 );
        String actual = actualOpt.get();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("8 remove last")
    public void t8_removeLast(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b");

        da.removeLast();

        int expected = 1;
        int actual = da.size();

        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("9 remove last")
    public void t9_removeLast(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a");

        da.removeLast();

        int expected = 0;
        int actual = da.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("10 remove last")
    public void t10_removeLast(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2);

        da.removeLast();

        int expected = 1;
        int actual = da.size();

        assertEquals(expected, actual);
    }


}
