package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Merge")
public class T2_ArrayUtilityHelperMerge {

    @Test
    @DisplayName("(1) merge and size")
    public void t1_merge1(){
        Integer[] m1 = {1,2,3,4,5};
        Integer[] m2 = {1,2,3,4,5,6,7,8};
        Integer[] m3 = {9,10};

        Integer[] actual = ArrayUtilityHelper.merge(m1,m2,m3);
        int expected = 15;

        System.out.println(ArrayUtilityHelper.toString(actual));

        assertEquals(expected, actual.length);
    }



    @Test
    @DisplayName("(2) merge and size")
    public void t2_merge(){
        Integer[] m1 = {1,2,3,4,5};
        Integer[] m2 = {6,7};


        Integer[] actual = ArrayUtilityHelper.merge(m1,m2);
        int expected = 7;

        System.out.println(ArrayUtilityHelper.toString(actual));

        assertEquals(expected, actual.length);
    }

    @Test
    @DisplayName("(3) merge and size")
    public void t3_merge(){
        Integer[] m1 = {1,2,3,4,5};
        Integer[] m2 = {6,7};


        Integer[] actual = ArrayUtilityHelper.merge(m1,m2);
        Integer expected = 7;

        System.out.println(ArrayUtilityHelper.toString(actual));

        assertEquals(expected, actual[actual.length - 1]);
    }

    @Test
    @DisplayName("(4) merge and size")
    public void t4_merge(){
        Integer[] m1 = {1,2,3,4,10};
        Integer[] m2 = {6,7};


        Integer[] actual = ArrayUtilityHelper.merge(m1,m2);
        Integer expected = 10;

        System.out.println(ArrayUtilityHelper.toString(actual));

        assertEquals(expected, actual[4]);
    }

    @Test
    @DisplayName("(5) merge and size")
    public void t5_merge(){
        Integer[] m1 = {1,2,3,4,10};
        Integer[] m2 = {6,7};


        Integer[] actual = ArrayUtilityHelper.merge(m1,m2);
        Integer expected = 3;

        System.out.println(ArrayUtilityHelper.toString(actual));

        assertEquals(expected, actual[2]);
    }

    @Test
    @DisplayName("(6) merge and size String")
    public void t6_merge(){
        String [] m1 = {"A", "B", "C"};
        String [] m2 = {"D", "E", "F", "G"};

        String[] actual = ArrayUtilityHelper.merge(String[]::new, m1, m2);
        String expected = "G";
        System.out.println(ArrayUtilityHelper.toString(actual));

        assertEquals(expected, actual[6]);

    }


//    @Test
//    @DisplayName("(6) merge and size")
//    public void t6_merge(){
//        Integer [] m1 = {1,2,3,4,6,7};
//        Integer [] m2 = {8,9};
//
//        Integer[] actual = ArrayUtilityHelper.merge(m1, m2);
//        Integer expected = 2;
//
//        assertEquals(expected, actual[1]);
//
//    }

    @Test
    @DisplayName("(7) merge and size")
    public void t7_merge(){
        Integer [] m1 = {1,2,3,4,10,11};
        Integer [] m2 = {12, 13};

        Integer [] actual = ArrayUtilityHelper.merge(m1, m2);
        Integer expected = 10;

        assertEquals(expected, actual[4]);
    }

    @Test
    @DisplayName("(8) merge and size")
    public void t8_merge(){
        Integer [] m1 = {1,2,3,4,10,11};
        Integer [] m2 = {12,13};

        Integer [] actual = ArrayUtilityHelper.merge(m1, m2);
        Integer expected = 12;

        assertEquals(expected, actual[6]);
    }

    @Test
    @DisplayName("(9) merge and size")
    public void t9_merge(){
        Integer [] m1 = {1,2,3,4,10,11};
        Integer [] m2 = {12, 13, 15};

        Integer [] actual = ArrayUtilityHelper.merge(m1, m2);
        Integer expected = 15;

        assertEquals(expected, actual[actual.length - 1]);
    }

    @Test
    @DisplayName("(10) merge and size")
    public void t10_merge(){
        Integer [] m1 = {1,2,3,4};
        Integer [] m2 = {12, 13, 15};

        Integer [] actual = ArrayUtilityHelper.merge(m1, m2);
        Integer expected = 13;

        assertEquals(expected, actual[5]);
    }
}
