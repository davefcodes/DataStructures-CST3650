package edu.citytech.cst3650.datastructure.csv;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class T3_DynamicArrayRemoveFirst {

    @Test
    @DisplayName("1 removeFirst")

    public void t1_removFirst(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");
        System.out.println(da);
        da.removeFirst();

        String expected = "b";
        Optional<String> actual = da.get(0);
        assertEquals(expected, actual.get());

        System.out.println(da);
    }

    @Test
    @DisplayName("2 removeFirst")

    public void t2_removFirst(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("e", "a", "b", "c");
        System.out.println(da);
        da.removeFirst();

        String expected = "a";
        Optional<String> actual = da.get(0);
        assertEquals(expected, actual.get());

        System.out.println(da);
    }

    @Test
    @DisplayName("3 removeFirst")

    public void t3_removFirst(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("b", "c");
        System.out.println(da);
        da.removeFirst();

        String expected = "c";
        Optional<String> actual = da.get(0);
        assertEquals(expected, actual.get());

        System.out.println(da);
    }


    @Test
    @DisplayName("4 removeFirst")

    public void t4_removeFirst(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1,2,3,4);
        da.removeFirst();

        int expected = 2;
        Optional<Integer> actualOpt = da.get(0);

        int actual = actualOpt.get();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("5 removeFirst")

    public void t5_removeFirst(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");
        System.out.println(da);
        da.removeFirst();

        int expected = 2;
        int actual = da.size();
        assertEquals(expected, actual);

        System.out.println(da);
    }


    @Test
    @DisplayName("6 removeFirst")

    public void t6_removeFirst(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4);

        da.removeFirst();

        int expected = 3;
        int actual = da.size();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("7 removeFirst")

    public void t7_removeFirst(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4, 5, 6);

        da.removeFirst();

        int expected = 5;
        int actual = da.size();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("8 removeFirst")

    public void t8_removeFirst(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4, 5, 6);

        da.removeFirst();

        int expected = 2;
        Optional<Integer> actualOpt = da.get(0);
        int actual = actualOpt.get();

        assertEquals(expected, actual);

        System.out.println(da);

    }

    @Test
    @DisplayName("9 removeFirst")

    public void t9_removeFirst(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(1, 2, 3, 4, 5, 6, 7);

        da.removeFirst();

        int expected = 2;
        Optional<Integer> actualOpt = da.get(0);
        int actual = actualOpt.get();

        assertEquals(expected, actual);

        System.out.println(da);
    }

    @Test
    @DisplayName("10 removeFirst")

    public void t10_removeFirst(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[] :: new);
        da.add(4, 5, 6, 7);

        da.removeFirst();

        int expected = 5;
        Optional<Integer> actualOpt = da.get(0);
        int actual = actualOpt.get();

        assertEquals(expected, actual);

        System.out.println(da);
    }






}
