package it.itismeucci.json_generics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationListMain {
    public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
        File file = new File("list.json");
        ObjectMapper om = new ObjectMapper();

        ArtworkList list = new ArtworkList();
        //List<Artwork> list = new ArrayList<>();
        list.add(new Sculpture("Titolo scultura", "test"));
        list.add(new Painting("Titolo quadro", "blah blah"));
        

        om.writeValue(file, list);


        ArtworkList aw = om.readValue(file, ArtworkList.class);
        aw.forEach(System.out::println);
    }
}
