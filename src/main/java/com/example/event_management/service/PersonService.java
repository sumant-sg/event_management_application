package com.example.event_management.service;

import com.example.event_management.model.Person;
import com.example.event_management.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public boolean createNewPerson(Person person){
        boolean isSaved = false;

        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}
