package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        //Given
        Instructors instructor = Instructors.getInstance();
        Students student = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();

        //When
        Teacher leon = instructor.findById(636364L);
        Student tatiana = student.findById(123456L);
        double expected = 16.0;
        zipCodeWilmington.hostLecture(leon, 80.0);
        double actual = tatiana.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void hostLectureEducatorTest() {
        //Given
        Instructors instructor = Instructors.getInstance();
        Students student = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();

        //When
        Educator dolio = Educator.DOLIO;
        Student tatiana = student.findById(123456L);
        double expected = 32.0;
        zipCodeWilmington.hostLecture(dolio, 80.0);
        double actual = tatiana.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0);
    }
}
