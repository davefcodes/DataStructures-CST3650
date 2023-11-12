package edu.citytech.cst3650.datastructure.singlylinkedlist;

import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class T2_RemoveFirst extends _MainTest{

    @Test
    @DisplayName("Remove 1st check size")
    public void t1(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        sl.removeFirst();
        var actual = sl.size();
        var expected = 4;

        print.accept(sl);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Remove 1st Item, and check value")
    public void t1b(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        sl.removeFirst();
        Optional<String> actual = sl.getFirstItem();
        var expected = "B";

        print.accept(sl);

        assertEquals(expected, actual.get());
    }

    @Test
    @DisplayName("Remove 1st test for zero records")
    public void t2(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A");

        sl.removeFirst();
        var actual = sl.size();
        var expected = 0;

        print.accept(sl);

        assertEquals(expected, actual);

    }

    @Test
    public void t3(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        int size = sl.size() + 1;
        for (int i = 0; i < sl.size(); i++)
            sl.removeFirst();

        print.accept(sl);

    }


    /*
        5 Test Cases by Faibil,David
     */

    @Test
    @DisplayName("Remove 1st and check value")
    public void t4(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("C", "D","E");

        sl.removeFirst();

        sl.removeFirst();
        Optional<String> actual = sl.getFirstItem();
        var expected = "C";

    }

    @Test
    @DisplayName("Add elements and check size")
    public void t5(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D");


        var actual = sl.size();
        var expected = 4;

        print.accept(sl);

        assertEquals(expected, actual);

    }


    @Test
    @DisplayName("Remove two elements and check size")
    public void t6(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C");

        sl.removeFirst();
        sl.removeFirst();

        var actual = sl.size();
        var expected = 1;

        print.accept(sl);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Check first element")
    public void t7(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");


        Optional<String> actual = sl.getFirstItem();
        var expected = "A";

        print.accept(sl);

        assertEquals(expected, actual.get());
    }

    @Test
    @DisplayName("Check last element")
    public void t8(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");


        Optional<String> actual = sl.getLastItem();
        var expected = "E";

        print.accept(sl);

        assertEquals(expected, actual.get());
    }





    public void deleteToMuch(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        int size = sl.size() + 1;
        for (int i =0; i < size; i++)
            sl.removeFirst();

        print.accept(sl);

    }

    @Test
    @DisplayName("Remove All test with Exception")
    public void t6Exception(){
        assertThrows(NoSuchElementException.class,
                ()->{
                     deleteToMuch();
                });
    }

}
