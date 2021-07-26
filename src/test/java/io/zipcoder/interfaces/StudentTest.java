package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void implementationTest() {
        //Given
        Student student = new Student(123456, "Tatiana", 5);

        //When

        //Then
        Assert.assertTrue(student instanceof Learner);
    }
}
