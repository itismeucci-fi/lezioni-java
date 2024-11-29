package it.itismeucci.json_generics;

public class Painting implements Artwork {
    private String commonProperty;
    private String specificB;

    public Painting() {
    }

    public Painting(String commonProperty, String specificB) {
        this.commonProperty = commonProperty;
        this.specificB = specificB;
    }

    // Getter e setter
    public String getCommonProperty() {
        return commonProperty;
    }

    public void setCommonProperty(String commonProperty) {
        this.commonProperty = commonProperty;
    }

    public String getSpecificB() {
        return specificB;
    }

    public void setSpecificB(String specificB) {
        this.specificB = specificB;
    }

    @Override
    public String toString() {
        return "Painting [commonProperty=" + commonProperty + ", specificB=" + specificB + "]";
    }
}