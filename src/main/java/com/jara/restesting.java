package com.jara;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class restesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate  = new RestTemplate();

        ResponseEntity<List<student>> response = restTemplate.exchange(
                "http://10.51.10.111:1000/units",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<student>>(){});
        List<student> registrations = response.getBody();

        for(unit ignored :toString() ) System.out.println(student.toString());

        System.err.println("Find One(GET)--------------------------------");

        unit unit = restTemplate.getForObject(
                "http://10.51.10.111:1000/units",
                unit.class);
        System.out.println(unit.toString());

        System.err.println("Creating(POST)______________________________");

        student studentnewStudent = new student("Elphas",
                "1234");
        Object newStudent = null;
        student createdstudent = restTemplate.postForObject(
                "hhttp://10.51.10.111:1000/registrations",
                newStudent, student.class);
        System.out.println(createdstudent.toString());

        System.err.println("____________________________________");
        String createunitUrl = " http://10.51.10.111:1000/registrations"
                +createdstudent.getId()+"/unit";

        unit newunit = new unit("Object Oriented Programming");
        unit createdunit = restTemplate.postForObject(
                createunitUrl,
                newunit, unit.class);
        System.out.println(createdunit.toString());
        unit newunit = new unit("Social Programming");
        unit createdunit = restTemplate.postForObject(
                createunitUrl,
                newunit, unit.class);
        System.out.println(createdunit.toString());
        unit newunit = new unit("Application Programming");
        unit createdunit = restTemplate.postForObject(
                createunitUrl,
                newunit, unit.class);
        System.out.println(createdunit.toString());

    }
}
