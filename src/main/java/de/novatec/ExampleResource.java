package de.novatec;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/sample")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{id}")
    public String hello(@PathParam UUID id) {
        return id.toString();
    }
}