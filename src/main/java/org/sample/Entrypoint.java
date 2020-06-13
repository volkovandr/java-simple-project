package org.sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.sample.model.Animal;

public class Entrypoint {
    public static void main(String[] args) {
        System.out.println("Hello");

        ObjectMapper mapper = new ObjectMapper();

        Animal a = new Animal(16, "Dog");
        
        try {
            System.out.println(mapper.writeValueAsString(a));
        } catch(JsonProcessingException e) {
            System.out.println("Could not create JSON");
            e.printStackTrace();
        }
    }

}