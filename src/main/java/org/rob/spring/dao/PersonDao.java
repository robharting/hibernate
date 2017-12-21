package org.rob.spring.dao;

import org.rob.entity.Person;

import java.util.List;

/**
 * Created by robendiane on 21-12-17.
 */
public interface PersonDao {
    void add(Person person);
    List<Person> listPersons();
}
