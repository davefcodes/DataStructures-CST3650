package edu.citytech.cst3650.datastructure.csv;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class T5_DynamicArrayRemoveData {

    @Test
    @DisplayName("1 remove")
   public void t1_removedIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");

        da.remove("a");

        String expected = "b";
        Optional<String> actual = da.get(0);

        assertEquals(expected, actual.get());

    }

    @Test
    @DisplayName("2 remove")
    public void t2_removedIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");

        da.remove("b");

        String expected = "c";
        Optional<String> actual = da.get(1);

        assertEquals(expected, actual.get());

    }

    @Test
    @DisplayName("3 remove")
    public void t3_removedIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");

        da.remove("c");

        String expected = "b";
        Optional<String> actual = da.get(1);

        assertEquals(expected, actual.get());

    }

    @Test
    @DisplayName("4 remove")
    public void t4_removedIndex(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4);

        da.remove(2);

        int expected = 3;
        Optional<Integer> actualOpt = da.get(1);
        int actual = actualOpt.get();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("5 remove")
    public void t5_removedIndex(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4, 5, 6, 7, 8, 9);

        da.remove(5);

        int expected = 6;
        Optional<Integer> actualOpt = da.get(4);
        int actual = actualOpt.get();

        assertEquals(expected, actual);

    }


    @Test
    @DisplayName("6 remove")
    public void t6_removedIndex(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4, 5, 6, 7, 8, 9);

        da.remove(5);

        int expected = 6;
        Optional<Integer> actualOpt = da.get(4);
        int actual = actualOpt.get();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("7 remove")
    public void t7_removedIndex(){

        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4, 5, 6, 7, 8, 9);

        da.remove(5);

        int expected = 8;
        int actual = da.size();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("8 remove")
    public void t8_removedIndex(){

        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3);

        da.remove(3);

        int expected = 2;
        int actual = da.size();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("9 remove")
    public void t9_removedIndex(){

        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c", "d");

        da.remove("a");

        int expected = 3;
        int actual = da.size();

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("10 remove")
    public void t10_removedIndex(){

        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b");

        da.remove("b");

        int expected = 1;
        int actual = da.size();

        assertEquals(expected, actual);

    }











}
