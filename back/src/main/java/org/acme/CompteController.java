package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/compte")
public class CompteController {
    @Path("/generateRandomString")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String generateRandomString() {
        //Doing some stuff here for now, but need to add a service / model
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
        String word = "";
        for(Integer i = 0; i < 10; i++){
          Double randomDouble = Math.floor(Math.random() * 68);
          Integer truncated = Integer.valueOf(randomDouble.intValue());
          word += chars.charAt(truncated);
        };
        return word;
    }
}