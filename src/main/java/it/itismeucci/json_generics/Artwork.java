package it.itismeucci.json_generics;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, 
        include = JsonTypeInfo.As.PROPERTY, 
        property = "type" 
)
@JsonSubTypes({ 
    @JsonSubTypes.Type(value = Sculpture.class, name = "sculpture_type"),
    @JsonSubTypes.Type(value = Painting.class, name = "paintyng_type")
})
public interface Artwork {
    String getCommonProperty();
}