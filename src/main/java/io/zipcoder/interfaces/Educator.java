package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    LEON(636364L, "Leon"),
    DOLIO(816525L, "Dolio"),
    KRIS (718293L, "Kris");

    private final Instructor instructor;
    private double timeWorked;

    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public double getTimeWorked(){
        return timeWorked;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }



}

