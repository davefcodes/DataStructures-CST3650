package edu.citytech.cst3650.datastructure.singlylinkedlist;

import edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class T1_AddData extends _MainTest {

    @Test
    public void T1(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        var actual = sl.size();
        var expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    public void T2(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        var actual = sl.getLastItem().get();
        var expected = "E";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("SinglyLinkedList by: Faibil, David ")
    public void T3(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        var actual = sl.getLastItem().get();
        var expected = "E";

        print.accept(sl.toString());

        assertEquals(expected, actual);

    }
}
