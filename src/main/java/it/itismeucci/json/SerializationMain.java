package it.itismeucci.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerializationMain {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("persona.json");

        // Oggetto da serializzare
        Persona persona = new Persona("Mario Rossi", 35, "mario.rossi@example.com");

        try {
            // Serializzazione: scrive l'oggetto nel file JSON
            objectMapper.writeValue(file, persona);
            System.out.println("Oggetto serializzato in persona.json");

            // Deserializzazione: legge l'oggetto dal file JSON
            Persona personaDeserializzata = objectMapper.readValue(file, Persona.class);
            System.out.println("Oggetto deserializzato: " + personaDeserializzata);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}