package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void implementationTest() {
        //Given
        Instructor instructor = new Instructor(789L, "Leon");

        //When

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        //Given
        Instructor instructor = new Instructor(789L, "Leon");

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
        Instructor instructor = new Instructor(789L, "Leon");
        Student student = new Student(123456L, "Tatiana", 0.0);
        instructor.teach(student, 20);

        //When
        double expectedStudyTime = 20;
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
        Instructor instructor = new Instructor(789L, "Leon");
        Student tatiana = new Student(123456L, "Tatiana", 0.0);
        Student miles = new Student(246L, "Miles", 0.0);
        Student nani = new Student(246L, "Nani", 0.0);
        Learner[] learners = {tatiana, miles, nani};

        //When
        instructor.lecture(learners,  27.0);

        double expectedTatiana = 9; //numberOfHours / learners.length + totalStudyTime
        double actualTatiana = tatiana.getTotalStudyTime();

        double expectedMiles = 9;
        double actualMiles = miles.getTotalStudyTime();

        double expectedNani = 9;
        double actualNani = nani.getTotalStudyTime();


        //Then
        Assert.assertEquals(expectedTatiana, actualTatiana, 0);
        Assert.assertEquals(expectedMiles, actualMiles, 0);
        Assert.assertEquals(expectedNani, actualNani, 0);
    }
}
