package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static edu.citytech.cst3650.datastructure.array.T3_ArrayUtilityHelperCopyRange.*;

@DisplayName("ArrayUtilityHelper by: Faibil, David")
public class T3_ArrayUtilityHelperCopyRange {

    @Test
    public void t1_size(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.copyRange(String[]::new, data, 0, 4);


        System.out.println(ArrayUtilityHelper.toString(newData));

        int expected = 5;
        int actual = newData.length;

        assertEquals(expected, actual);

    }


    @Test
    public void t2_lastElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.copyRange(String[]::new, data, 1, 4);

        System.out.println(ArrayUtilityHelper.toString(newData));

        var expected = "n5";
        var actual = newData[newData.length - 1];

        assertEquals(expected, actual);

    }


    @Test
    public void t3_firstElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.copyRange(String[]::new, data, 0, 4);

        System.out.println(ArrayUtilityHelper.toString(newData));

        var expected = "n1";
        var actual = newData[0];

        assertEquals(expected, actual);

    }

    @Test
    public void t4_secondElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.copyRange(String[]::new, data, 0, 4);

        System.out.println(ArrayUtilityHelper.toString(newData));

        var expected = "n2";
        var actual = newData[1];

        assertEquals(expected, actual);

    }

    @Test
    public void t5_thirdElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.copyRange(String[]::new, data, 0, 4);

        System.out.println(ArrayUtilityHelper.toString(newData));

        var expected = "n3";
        var actual = newData[2];

        assertEquals(expected, actual);

    }

    @Test
    public void t6_size(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6"};
        String[] newData = ArrayUtilityHelper.copyRange(String[]::new, data, 2, 5);


        System.out.println(ArrayUtilityHelper.toString(newData));

        int expected = 4;
        int actual = newData.length;

        assertEquals(expected, actual);

    }

    @Test
    public void t7_size(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "n7", "n8"};
        String[] newData = ArrayUtilityHelper.copyRange(String[]::new, data, 0, 7);


        System.out.println(ArrayUtilityHelper.toString(newData));

        int expected = 8;
        int actual = newData.length;

        assertEquals(expected, actual);

    }

    @Test
    public void t8_size(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "n7", "n8", "n9"};
        String[] newData = ArrayUtilityHelper.copyRange(String[]::new, data, 3, 8);


        System.out.println(ArrayUtilityHelper.toString(newData));

        int expected = 6;
        int actual = newData.length;
        assertEquals(expected, actual);

    }

    @Test
    public void t9_size(){
        Integer[] data = {1, 2, 3, 4, 5, 6, 7};
        Integer[] newData = ArrayUtilityHelper.copyRange(Integer[]::new, data, 0, 6);


        System.out.println(ArrayUtilityHelper.toString(newData));

        int expected = 7;
        int actual = newData.length;
        assertEquals(expected, actual);

    }

    @Test
    public void t10_lastIntegerElement(){
        Integer[] data = {1, 2, 3, 4, 5, 6, 7};
        Integer[] newData = ArrayUtilityHelper.copyRange(Integer[]::new, data, 1, 5);


        System.out.println(ArrayUtilityHelper.toString(newData));

        int expected = 6;
        int actual = newData[newData.length - 1];
        assertEquals(expected, actual);

    }

}
