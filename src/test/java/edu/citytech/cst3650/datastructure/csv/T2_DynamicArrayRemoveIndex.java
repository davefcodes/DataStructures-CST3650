package edu.citytech.cst3650.datastructure.csv;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.citytech.cst3650.datastructure.model.SimpleStock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T2_DynamicArrayRemoveIndex {

    @Test
    @DisplayName("Ist test in remove")
   public void t1_removedIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");
        da.removeAt(1);

        Optional<String> actual = da.get(1);
        String expected = "c";

        assertEquals(expected, actual.get());
    }

    @Test
    @DisplayName("2removeIndex")
    public void t2_removedIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");
        da.removeAt(1);

        int actual = da.size();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("3removeIndex")
    public void t3_removedIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");
        da.removeAt(0);
        da.removeAt(0);
        da.removeAt(0);

        int actual = da.size();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("4removeIndex")
    public void t4_removedIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[] :: new);
        da.add("a", "b", "c");
        da.removeAt(0);
        da.removeAt(0);
        da.removeAt(0);
        da.add("Z");
        int actual = da.size();
        int expected = 1;
        assertEquals(expected, actual);
    }

}
