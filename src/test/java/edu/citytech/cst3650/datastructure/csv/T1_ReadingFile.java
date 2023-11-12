package edu.citytech.cst3650.datastructure.csv;

import com.jbbwebsolution.fileutility.SVUtility;
import edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper;
import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.citytech.cst3650.datastructure.model.SimpleStock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T1_ReadingFile {

    @Test
    @DisplayName("SVUtility: Faibil, David")
    public void t1_size(){
       var svUtility = new SVUtility<SimpleStock>();
       String fileName = "./data/cst3650.stock.quant.csv";
       java.net.URL resource = SVUtility.class.getClassLoader().getResource(fileName);

       svUtility.process(System.out::println,resource, SimpleStock.class, 2, ",");


    }

    @Test
    @DisplayName("DynamicArray: By David Faibil")
    public void t2_size(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 20);
        System.out.println(da);
    }

    @Test
    @DisplayName("DynamicArray: By David Faibil")
    public void t3_size(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 10);

        da.add("A");
        da.add("B");
        da.add("C");
        da.add("D");
        da.add("E");
        da.add("F");
        da.add("G");
        da.add("H");
        da.add("I");
        da.add("J");
        da.add("K");
        da.add("L");
        da.add("M");

//        da.add("N", "O", "P", "Q");

        int actual = da.size();
        int expected = 12;

        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("DynamicArray: By David Faibil")
    public void t4_get(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 10);

        da.add("A");
        da.add("B");
        da.add("C");
        da.add("D");
        da.add("E");
        da.add("F");
        da.add("G");
        da.add("H");
        da.add("I");
        da.add("J");
        da.add("K");
        da.add("L");
        da.add("M");

        da.add("N", "O", "P", "Q");

        var actual = da.get(16).get() + da.get(0).get();
        var expected = "Q" + "A";

        System.out.println(da);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("DynamicArray: By David Faibil")
    public void t5_get(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 10);

        da.add("A");
        da.add("B");


        var actual = da.get(16);
        var expected = Optional.empty();

        assertEquals(expected, actual);
    }



    @Test
    @DisplayName("SVUtility and DA.size() : Faibil, David")
    public void t6_size(){
        var svUtility = new SVUtility<SimpleStock>();
        String fileName = "./data/cst3650.stock.quant.csv";
        java.net.URL resource = SVUtility.class.getClassLoader().getResource(fileName);
        DynamicArray<SimpleStock> da = new DynamicArray<>(SimpleStock[]::new, 0);
        svUtility.process(da::add,resource, SimpleStock.class, 2, ",");




        var actual = da.size();
        var expected = 4500;
        var condition = actual > expected;
        assertTrue(condition);

        da.removeAll();

        svUtility.process(da::add,resource, SimpleStock.class, 2, ",");
        System.out.println(da);
    }
}
