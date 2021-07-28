package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class People <E extends Person> implements Iterable <E> {

    List<E> personList = new ArrayList<>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(Long id) {
        for (E person : personList){
            Long currentId = person.getId();
            if (currentId.equals(id)){
                return person;
            }
        }

        return null;
    }

    public boolean contains(Person person) {
        if (personList.contains(person)) {
            return true;
        }

            return false;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove (Long id) {
        for (E person : personList) {
            Long currentId = person.getId();
            if (currentId.equals(id)) {
                personList.remove(person);
            }
        }
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count() {
        return personList.size();
    }


    public abstract E[] toArray();

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }



}


