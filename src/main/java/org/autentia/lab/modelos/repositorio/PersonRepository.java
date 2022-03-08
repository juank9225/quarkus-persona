package org.autentia.lab.modelos.repositorio;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import org.autentia.lab.modelos.Person;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements ReactivePanacheMongoRepository<Person> {
}
