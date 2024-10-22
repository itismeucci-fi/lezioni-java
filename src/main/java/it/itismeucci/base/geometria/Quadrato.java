package it.itismeucci.base.geometria;

public class Quadrato extends FiguraGeometrica {

    private float lato;

    @Override
    public float calcolaArea() {
        return this.lato * this.lato;    
    }

}
