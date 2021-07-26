package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void ConstructorTest() {
        //Given
        long expectedId = 123456;
        String expectedName = "Tatiana";
        Person tatiana = new Person (123456, "Tatiana");

        //When
        long actualId = tatiana.getId();
        String actualName = tatiana.getName();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest(){
        //Given
        long expectedId = 123456;
        String expectedName = "Tatiana";
        Person person = new Person (expectedId, expectedName);

        //When
        person.setName("Tatiana");
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }


}
