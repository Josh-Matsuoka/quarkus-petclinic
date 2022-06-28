package org.quarkus.samples.petclinic.system;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ErrorExceptionMapper implements ExceptionMapper<Exception> {

    @Inject
    TemplatesLocale templates;

    @Override
    public Response toResponse(Exception exception) {
        try {
            throw exception;
        } catch(Exception e) {
            return Response.ok(templates.error(exception.getMessage())).build();
        }
    }

    
}
