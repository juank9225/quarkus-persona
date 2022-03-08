package org.autentia.lab.service;

import io.smallrye.mutiny.Uni;
import org.autentia.lab.modelos.Person;
import org.autentia.lab.modelos.repositorio.PersonRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepository personRepository;

    public Uni<Person> findname(String nombre){
        return personRepository.find("nombre",nombre).firstResult();
    }
}
