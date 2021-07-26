package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    double totalStudyTime;

    public Student(long id, String name, double totalStudyTime) { //https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit5-Writing-Classes/topic-5-2-writing-constructors.html
        super(id, name);
        this.totalStudyTime = totalStudyTime; //assigns the value of the parameter totalStudyTime to the field of the same name
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }


    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
