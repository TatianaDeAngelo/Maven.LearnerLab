package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void getInstructorsTest() {
        //Given
        People people = Instructors.getInstance();
        int expected = 3;

        //When
        int actual = people.count();


        //Then
        Assert.assertEquals(expected, actual);
    }
}
