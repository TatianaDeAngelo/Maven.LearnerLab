package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
         @Test
        public void implementationTest() {
            //Given
            Educator instructor = Educator.LEON;

            //When

            //Then
            Assert.assertTrue(instructor instanceof Teacher);
        }


        @Test
        public void teachTest(){
            //Given
            Educator educator = Educator.DOLIO;
            Student student = new Student(123456L, "Tatiana", 0.0);
            educator.teach(student, 20);

            //When
            double expectedTimeWorked = 20;
            double actualTimeWorked = educator.getTimeWorked();

            //Then
            Assert.assertEquals(expectedTimeWorked, actualTimeWorked,0); //added a 0 for delta because otherwise assertEquals was crossed out
        }

        @Test
        public void lectureTest(){
            //Given
            Educator educator = Educator.KRIS;
            Double timeLectured = 45.0;
            Student[] students = Students.getInstance().toArray();

            //When
            educator.lecture(students,timeLectured);
            Student studentLec = Students.getInstance().findById(123456L);
            Double actual = studentLec.getTotalStudyTime();
            Double expected = 9.0;

            //Then
            Assert.assertEquals(expected, actual);

        }
    }


