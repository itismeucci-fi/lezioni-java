package it.itismeucci.lista;

import java.util.ArrayList;

public class MainListStudent {


    public static void main(String[] args) {
        ArrayList<Student> slist = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            slist.add(new Student("a" + i, "b"+i));
            
            System.out.println(slist.get(i));
        }

        System.out.println(slist.size());

        slist.remove(7);

        System.out.println(slist.size());
        
    }
}
