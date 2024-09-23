package it.itismeucci.base;

public class Main01Parameter {

    private static void testCopy(int a) {
        //viene modificata una copia del parametro
        a = 10;
    }

    private static void testImmutable(Integer a) {
        //viene creata una nuova istanza
        a = 10;
    }

    private static void testMutable(MyIntegerWrapper a) {
        //viene modificata l'istanza
        a.setVal(10);
    }


    public static void main(String[] args) {
        int x = 50;
        
        testCopy(x);
        // il valore di x non cambia poichè è passato per copia
        System.out.println("Valore di x dopo la chiamata " + x);

        testImmutable(x);
        // il valore di x non cambia poichè anche se passato per riferimento i tipi wrapper sono immutabili
        System.out.println("Valore di x dopo la chiamata " + x);


        MyIntegerWrapper y = new MyIntegerWrapper(50);
        testMutable(y);
        // il valore di y cambia poichè passato per riferimento e il tipo MyIntegerWrapper non è immutabile
        System.out.println("Valore di y dopo la chiamata " + y);
    }
}
