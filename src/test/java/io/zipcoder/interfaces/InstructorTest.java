package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void implementationTest() {
        //Given
        Instructor instructor = new Instructor(789, "Leon");

        //When

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        //Given
        Instructor instructor = new Instructor(789, "Leon");

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest(){
        /**
         * remember
         * public void teach(Learner learner, double numberOfHours);
         * this is why the parameters are passed inside the teach method
         */
        //Given
        Instructor instructor = new Instructor(789, "Leon");
        Student student = new Student(123456, "Tatiana", 5);
        instructor.teach(student, 20);

        //When
        double expectedStudyTime = 25;
        double actualStudyTime = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedStudyTime, actualStudyTime,0); //added a 0 for delta because otherwise assertEquals was crossed out
    }

    @Test
    public void lectureTest(){
        /**
         * remember
         * public void lecture(Learner[] learners, double numberOfHours)
         * this is why the parameters are passed inside the lecture method
         * double numberOfHoursPerLearner = numberOfHours / learners.length;
         */
        //Given
        Instructor instructor = new Instructor(789, "Leon");
        Student tatiana = new Student(123456, "Tatiana", 5);
        Student miles = new Student(246, "Miles", 2);
        Student nani = new Student(246, "Miles", 7);
        Learner[] learners = {tatiana, miles, nani};

        //When
        instructor.lecture(learners,  27);

        double expectedTatiana = 14; //numberOfHours / learners.length + totalStudyTime
        double actualTatiana = tatiana.getTotalStudyTime();

        double expectedMiles = 11;
        double actualMiles = miles.getTotalStudyTime();

        double expectedNani = 16;
        double actualNani = nani.getTotalStudyTime();


        //Then
        Assert.assertEquals(expectedTatiana, actualTatiana, 0);
        Assert.assertEquals(expectedMiles, actualMiles, 0);
        Assert.assertEquals(expectedNani, actualNani, 0);
    }
}
