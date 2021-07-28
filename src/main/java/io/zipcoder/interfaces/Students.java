package io.zipcoder.interfaces;

/**
 * what is an unextendable subclass in java?
 * The final keyword is used with the declaration of a class to make it non-extendable.
 */

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(123456, "Tatiana", 0));
        this.add(new Student(5110, "Manny", 0));
        this.add(new Student(1516, "Bobbi", 0));
        this.add(new Student(600000, "Dee", 0));
        this.add(new Student(314, "Charnae", 0));

    }

    public static Students getInstance() {
        return INSTANCE;
    }


    @Override
    public Student[] toArray(){
        return personList.toArray(new Student[0]);
    }



}


