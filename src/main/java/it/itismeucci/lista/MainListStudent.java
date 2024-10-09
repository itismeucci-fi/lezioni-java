package it.itismeucci.lista;

import java.util.ArrayList;
import java.util.Iterator;

public class MainListStudent {


    public static void main(String[] args) {
        ArrayList<Student> slist = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            slist.add(new Student("a" + i, "b"+i));
            System.out.println(slist.get(i));
        }

        Student s = slist.get(5);

        System.out.println(slist.size());
        slist.remove(7);
        System.out.println(slist.size());
        slist.remove(s);
        System.out.println(slist.size());

        String name = "a0";
        Iterator<Student> iterator = slist.iterator(); //istanzia un iterator
        while (iterator.hasNext()) { //finchè ce ne sono ancora
            Student stud = iterator.next(); // prendi l'elemento successivo
            if (stud.getName().equals(name)) {
                iterator.remove(); //rimuovi l'elemento dalla lista
            }
        }
        System.out.println(slist.size());
        for (int i = 0; i < 10; i++) {
            slist.add(new Student("a" + i, "b"+i));
            System.out.println(slist.get(i));
        }

    }
}
