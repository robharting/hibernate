package org.rob.spring.service;

import org.rob.entity.Person;
import org.rob.spring.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by robendiane on 21-12-17.
 */
@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonDao userDao;

    @Transactional
    @Override
    public void add(Person person) {
        userDao.add(person);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Person> listPersons() {
        return userDao.listPersons();
    }
}
