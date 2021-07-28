package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest {
    @Test
    public void addPersonTest(){
    //Given
    List<Person> personList = new ArrayList<>();
    Person person = new Person(123456L, "Tatiana");

    //When
    personList.add(person);
    boolean actual = personList.contains(person);

    //Then
    Assert.assertTrue(actual);

    }

    @Test
    public void removePersonTest(){
        //Given
        List<Person> personList = new ArrayList<>();
        Person person = new Person(123456L, "Tatiana");

        //When
        personList.remove(person);
        boolean actual = personList.contains(person);

        //Then
        Assert.assertFalse(actual);

    }

    @Test
    public void findPersonByIdTest(){
        //Given
        Person person = new Person(123456L, "Tatiana");
        People people = Students.getInstance();

        //When
        people.add(person);
        Person actual = people.findById(123456L);

        //Then
        Assert.assertEquals(person, actual);
    }


}
