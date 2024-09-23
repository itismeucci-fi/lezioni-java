package it.itismeucci.base;

/**
 * Wrapper del tipo integer customizzato per essere mutabile
 */
public class MyIntegerWrapper {

    /**
     * l'attribute val è privato
     * la lettura viene garantito dal metodo getter
     * la modifica viene garantito dal metodo setter
     */
    private int val;

    public MyIntegerWrapper(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "" + val;
    }

}
