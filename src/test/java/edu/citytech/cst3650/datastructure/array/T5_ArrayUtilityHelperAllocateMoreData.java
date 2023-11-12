package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("ArrayUtilityHelper.AllocateMoreData by: Faibil, David")
public class T5_ArrayUtilityHelperAllocateMoreData {


    @Test
    @DisplayName("1 Allocate More Data")
    public void t1_allocateMoreData(){
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize = 15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));

        System.out.println(ArrayUtilityHelper.toString(newData));

        var expected = newSize;
        var actual = newData.length;

       assertEquals(expected, actual);

    }

    @Test
    @DisplayName("2 Allocate More Data")
    public void t2_allocateMoreData(){
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize = 15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = null;
        String actual = newData[newData.length - 1];

        assertEquals(expected, actual);


    }

    @Test
    @DisplayName("3 Allocate More Data")
    public void t3_allocateMoreData(){
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize = 15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = "n6";
        String actual = newData[5];

        assertEquals(expected, actual);


    }


    @Test
    @DisplayName("4 Allocate More Data")
    public void t4_allocateMoreData(){
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7", "n8"};
        int newSize = 10;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));


        Integer expected = newSize;
        Integer actual = 10;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("5 Allocate More Data")
    public void t5_allocateMoreData(){
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6"};
        int newSize = 8;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));


        Integer expected = newSize;
        Integer actual = 8;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("6 Allocate More Data")
    public void t6_allocateMoreData(){
        Integer[] data1 = {1, 2, 3, 4, 5};
        Integer[] data2 = {6, 7};
        int newSize = 10;
        Integer[] newData = ArrayUtilityHelper.allocateMoreData(Integer[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));


        Integer expected = 5;
        Integer actual =newData[4];

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("7 Allocate More Data")
    public void t7_allocateMoreData(){
        Integer[] data1 = {1, 2, 3, 4, 5};
        Integer[] data2 = {6, 7, 8};
        int newSize = 12;
        Integer[] newData = ArrayUtilityHelper.allocateMoreData(Integer[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));


        Integer expected = 12;
        Integer actual = newData.length;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("8 Allocate More Data")
    public void t8_allocateMoreData(){
        Integer[] data1 = {1, 2, 3, 4, 5};
        Integer[] data2 = {6, 7, 8};
        int newSize = 12;
        Integer[] newData = ArrayUtilityHelper.allocateMoreData(Integer[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));


        Integer expected = 3;
        Integer actual = newData[2];

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("9 Allocate More Data")
    public void t9_allocateMoreData(){
        Integer[] data1 = {1, 2, 3, 4, 5};
        Integer[] data2 = {6, 7, 8, 9};
        int newSize = 15;
        Integer[] newData = ArrayUtilityHelper.allocateMoreData(Integer[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));


        Integer expected = null;
        Integer actual = newData[newData.length - 1];

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("10 Allocate More Data")
    public void t10_allocateMoreData(){
        Integer[] data1 = {1, 2, 3, 4, 5};
        Integer[] data2 = {6, 7, 8, 9};
        int newSize = 19;
        Integer[] newData = ArrayUtilityHelper.allocateMoreData(Integer[]::new, data1, newSize, data2);

        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));


        Integer expected = null;
        Integer actual = newData[10];

        assertEquals(expected, actual);
    }





}
