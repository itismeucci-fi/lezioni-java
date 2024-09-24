
package it.itismeucci.costruttore;

public class Main02Constructor {

    public static void main(String[] args) {
        // utilizzo del costruttore di default
        Student s = new Student();
        s.setName("Gian Giacomo");
        s.setSurname("Caprotti");
        s.setClazz("4CIA");
        System.out.println(s);

        // teacher non ha il costruttore di default
        // Teacher t = new Teacher(); // the constructor is undefined
        Teacher t = new Teacher("Leonardo", "Davinci");
        System.out.println(t);
    }
}
