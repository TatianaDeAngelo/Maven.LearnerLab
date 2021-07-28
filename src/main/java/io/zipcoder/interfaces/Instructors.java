package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

        private static final Instructors INSTANCE = new Instructors();

        private Instructors() {
            this.add(new Instructor(636364L, "Leon"));
            this.add(new Instructor(816525L, "Dolio"));
            this.add(new Instructor(718293L, "Kris"));


        }

        public static Instructors getInstance() {
            return INSTANCE;
        }

    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);

    }
}

