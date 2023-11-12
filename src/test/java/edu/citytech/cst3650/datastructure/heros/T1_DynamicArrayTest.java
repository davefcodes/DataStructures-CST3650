package edu.citytech.cst3650.datastructure.heros;

import edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper;
import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.learning.datatructure.java17.data.Hero;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class T1_DynamicArrayTest extends _MainTest {
    static DynamicArray<Hero> da = new DynamicArray<>(Hero[]::new, 10);

    @BeforeEach
    public void addHeroBeforeAll() {
        da.add(heroes);
        print.accept("-".repeat(50));
    }

    @Test
    @DisplayName("(1) add heroes")
    public void addHeroes(){

        print.accept(da);
        int expected = 39;
        int actaul = da.size();

        assertEquals(expected, actaul);

    }
    @Test
    @DisplayName("(2) removeAll")
    public void sizeTest(){
        da.removeAll();
        print.accept(da);
        int expected = 0;
        int actaul = da.size();
        assertEquals(expected, actaul);
    }

    @Test
    @DisplayName("(3) remove")
    public void removeFirst(){
        da.removeFirst();
        print.accept(da);
        int expected = 38;
        int actaul = da.size();
        assertEquals(expected, actaul);
    }

    @Test
    @DisplayName("(4) removeAt")
    public void removeAt(){
        da.removeAt(1);
        print.accept(da);
        int expected = 38;
        int actaul = da.size();
        assertEquals(expected, actaul);
    }

    @Test
    @DisplayName("(5) get")
    public void equalTo(){
        da.get(9);
        print.accept(da);
        var expected = "batman";
        var actaul = da.get(9).get().name();
        assertEquals(expected, actaul);
    }

    @Test
    @DisplayName("(6) removeFirst/get")
    public void equalTo2(){
        da.get(9);
        print.accept(da);
        var expected = "wonderwoman";
        var actaul = da.get(9).get().name();
        assertEquals(expected, actaul);
    }




}
