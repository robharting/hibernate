package org.rob.spring.service;

import org.rob.entity.Person;

import java.util.List;

/**
 * Created by robendiane on 21-12-17.
 */
public interface PersonService {
    void add(Person person);
    List<Person> listPersons();
}
