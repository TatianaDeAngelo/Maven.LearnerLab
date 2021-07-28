package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    static ZipCodeWilmington INSTANCE = new ZipCodeWilmington(); //EagerInitializationSingleton

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);
        Learner[] learners = students.personList.toArray(new Learner[0]);
        instructor.lecture(learners, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for (Student student : students.personList) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }

}



