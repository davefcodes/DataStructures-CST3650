package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("ArrayUtilityHelper.removeByIndex by: Faibil, David")
public class T4_ArrayUtilityHelperRemoveByIndex {

    @Test
    public void t1_removeIndex(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeByIndex(String[]::new, data, 0);

        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

        var expected = "n2";
        var actual = newData[0];

       assertEquals(expected, actual);

    }

    @Test
    public void t2_removeIndex(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeByIndex(String[]::new, data, 4);

        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

        var expected = "n4";
        var actual = newData[newData.length - 1];

        assertEquals(expected, actual);

    }


}
