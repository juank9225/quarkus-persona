package org.autentia.lab;

import io.smallrye.mutiny.Uni;
import org.autentia.lab.modelos.Person;
import org.autentia.lab.service.PersonService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
@Path("/persona")
public class PersonaResource {

    @Inject
    PersonService personService;

    @GET
    @Path("/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Person> personaNme(@Valid @PathParam("nombre") String nombre) {
        return personService.findname(nombre);
    }
}