package edu.citytech.cst3650.datastructure.singlylinkedlist;

import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class T3_RemoveLast extends _MainTest{

    @Test
    @DisplayName("RemoveLast: check size")
    public void t1(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        sl.removeLast();
        var actual = sl.size();
        var expected = 4;

        print.accept(sl);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("RemoveLast: Remove  Last Item, and check value")
    public void t1b(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        sl.removeLast();
        Optional<String> actual = sl.getLastItem();
        var expected = "D";

        print.accept(sl);

        assertEquals(expected, actual.get());
    }

    @Test
    @DisplayName("RemoveLast: Remove last test for zero records")
    public void t2(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A");

        sl.removeLast();
        var actual = sl.size();
        var expected = 0;

        print.accept(sl);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("RemoveLast: Remove All")
    public void t3(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        int size = sl.size() + 1;
        for (int i = 0; i < 5; i++)
            sl.removeLast();

        print.accept(sl);

    }

    public void deleteToMuch(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");

        int size = sl.size() + 1;
        for (int i =0; i < size; i++)
            sl.removeLast();

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



    /*
        5 Test Cases by Faibil,David
     */

    @Test
    public void t4(){
        var sl = new SinglyLinkedList<>(Integer[]::new);
        sl.add(1, 2, 3, 4);

        int size = sl.size() + 1;
//        for (int i = 0; i < sl.size(); i++)
            sl.removeLast();
        sl.removeLast();
        sl.removeLast();
        print.accept(sl);


        assertEquals(1, sl.size());

    }

    @Test
    public void t5(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C");

        sl.removeLast();
        sl.removeLast();
        var actual = sl.size();
        var expected = 1;

        print.accept(sl);

        assertEquals(expected, actual);

    }


    @Test
    @DisplayName("Remove two elements and check size")
    public void t6(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C");

        sl.removeLast();

        var actual = sl.size();
        var expected = 2;

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


}
