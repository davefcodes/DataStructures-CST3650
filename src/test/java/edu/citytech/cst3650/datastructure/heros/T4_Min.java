package edu.citytech.cst3650.datastructure.heros;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;

public class T4_Min extends _MainTest {

    @Test
    public void t1_Min(){
        Integer[] items = {64, 25, 12, 22, 11};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);


        dynamicArray.min((Integer index,Integer value) -> {
            atomicReference.set(value);
        } );


        var actual = atomicReference.get();
        var expected = 11;
        assertEquals(expected, actual, 0f);
    }


    @Test
    public void t2_Min(){
        String[] items = {"A", "B", "C", "Z", "X"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = "A";
        assertEquals(expected, actual);
    }

    @Test
    public void t3_Min(){
        String[] items = {"E", "F", "G"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = "E";
        assertEquals(expected, actual);

    }

    @Test
    public void t4_Min(){
        Integer[] items = {1, 2, 3, 4, 5, 6};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index, Integer value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 1;
        assertEquals(expected, actual, 0f);

    }


    @Test
    public void t5_Min(){
        Integer[] items = {12, 13, 15, 16};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index, Integer value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 12;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t6_Min(){
        Integer[] items = {20, 30, 80, 40};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index, Integer value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 20;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t7_Min(){
        String[] items = {"F", "K", "H", "J"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = "F";
        assertEquals(expected, actual);

    }

    @Test
    public void t8_Min(){
        String[] items = {"animal", "ball", "key"}; //
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = "animal";
        assertEquals(expected, actual);

    }

    @Test
    public void t9_Min(){
        Double[] items = {1.0, 2.0, 3.0, 4.0};
        DynamicArray<Double> dynamicArray = new DynamicArray<>(Double[]::new);
        AtomicReference<Double> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((index, value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 1.0;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t10_Min(){
        Double[] items = {20.0, 40.0, 30.0};
        DynamicArray<Double> dynamicArray = new DynamicArray<>(Double[]::new);
        AtomicReference<Double> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((index, value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 20.0;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t11_Min(){
        Double[] items = {60.0, 80.0, 30.0};
        DynamicArray<Double> dynamicArray = new DynamicArray<>(Double[]::new);
        AtomicReference<Double> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = 30.0;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t12_Min(){
        Integer[] items = {100, 200, 50};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);


        dynamicArray.min((Integer index,Integer value) -> {
            atomicReference.set(value);
        } );

        var actual = atomicReference.get();
        var expected = 50;
        assertEquals(expected, actual, 0f);
    }

}
