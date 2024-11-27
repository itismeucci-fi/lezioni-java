package it.itismeucci.json;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationMapMain {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("persona-map.json");
        
        // Oggetto da serializzare
        Map<String, Persona> map = new HashMap<>();
        map.put("Mario Rossi", new Persona("Mario Rossi", 35, "mario.rossi@example.com"));
        map.put("Mario BIanchi", new Persona("Mario BIanchi", 40, "mario.bianchi@example.com"));

        try {
            // Serializzazione: scrive l'oggetto nel file JSON
            objectMapper.writeValue(file, map);
            System.out.println("Oggetto serializzato in persona-map.json");

            // Deserializzazione: legge l'oggetto dal file JSON
            Map<String, Persona> mapDeserializzata = objectMapper.readValue(file, new TypeReference<Map<String, Persona>>() {});
            System.out.println("Oggetto deserializzato: " + mapDeserializzata);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
