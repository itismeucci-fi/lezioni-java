package it.itismeucci.json_generics;

public class Sculpture implements Artwork {
    private String commonProperty;
    private String specificA;

    public Sculpture() {
    }

    public Sculpture(String commonProperty, String specificA) {
        this.commonProperty = commonProperty;
        this.specificA = specificA;
    }

    // Getter e setter
    public String getCommonProperty() {
        return commonProperty;
    }

    public void setCommonProperty(String commonProperty) {
        this.commonProperty = commonProperty;
    }

    public String getSpecificA() {
        return specificA;
    }

    public void setSpecificA(String specificA) {
        this.specificA = specificA;
    }

    @Override
    public String toString() {
        return "Sculpture [commonProperty=" + commonProperty + ", specificA=" + specificA + "]";
    }
}