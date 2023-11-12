package edu.citytech.cst3650.datastructure.heros;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;

public class T3_Max extends _MainTest {

    @Test
    public void t1_Max(){
        Integer[] items = {64, 25, 12, 22, 11};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);


        dynamicArray.max((Integer index,Integer value) -> {
            atomicReference.set(value);
        } );


      var actual = atomicReference.get();
      var expected = 64;
      assertEquals(expected, actual, 0f);
    }


    @Test
    public void t2_Max(){
        String[] items = {"A", "B", "C", "Z", "X"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = "Z";
        assertEquals(expected, actual);
    }

    @Test
    public void t3_Max(){
        String[] items = {"A", "B", "C", "D"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = "D";
        assertEquals(expected, actual);

        }

    @Test
    public void t4_Max(){
        Integer[] items = {1, 2, 3, 4, 5, 6};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index, Integer value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 6;
        assertEquals(expected, actual, 0f);

    }


    @Test
    public void t5_Max(){
        Integer[] items = {1, 2, 3, 10, 11};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index, Integer value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 11;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t6_Max(){
        Integer[] items = {20, 30, 80, 40};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index, Integer value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 80;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t7_Max(){
        String[] items = {"F", "K", "H", "J"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = "K";
        assertEquals(expected, actual);

    }

    @Test
    public void t8_Max(){
        String[] items = {"animal", "ball", "key"}; //
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((index, value) -> {
            atomicReference.set(value);
        });

        var actual = atomicReference.get();
        var expected = "key";
        assertEquals(expected, actual);

    }

    @Test
    public void t9_Max(){
        Double[] items = {1.0, 2.0, 3.0, 4.0};
        DynamicArray<Double> dynamicArray = new DynamicArray<>(Double[]::new);
        AtomicReference<Double> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((index, value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 4.0;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t10_Max(){
        Double[] items = {20.0, 40.0, 30.0};
        DynamicArray<Double> dynamicArray = new DynamicArray<>(Double[]::new);
        AtomicReference<Double> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((index, value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 40.0;
        assertEquals(expected, actual, 0f);

    }
    @Test
    public void t11_Max(){
        Double[] items = {60.0, 80.0, 30.0};
        DynamicArray<Double> dynamicArray = new DynamicArray<>(Double[]::new);
        AtomicReference<Double> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((index, value) -> {
            atomicReference.set(value);
        });


        var actual = atomicReference.get();
        var expected = 80.0;
        assertEquals(expected, actual, 0f);

    }

    @Test
    public void t12_Max(){
        Integer[] items = {100, 200, 50};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);


        dynamicArray.max((Integer index,Integer value) -> {
            atomicReference.set(value);
        } );


        var actual = atomicReference.get();
        var expected = 200;
        assertEquals(expected, actual, 0f);
    }




}




