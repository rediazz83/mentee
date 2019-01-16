package edu.mentee.demo.rest.controllers;

import edu.mentee.demo.domain.Persona;
import edu.mentee.demo.rest.responses.GenericResponse;
import edu.mentee.demo.rest.responses.ServiceStatus;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say-rest")
public class GreetingRestController {

    @ApiOperation(value = "Short description of what does", response = GenericResponse.class)
    @GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse sayGreeting() {
        ServiceStatus status = new ServiceStatus(HttpStatus.OK.value(), "Success");
        Persona persona = new Persona("Rodrigo", "Diaz","Zuniga");
        return new GenericResponse(status, persona);
    }

}
