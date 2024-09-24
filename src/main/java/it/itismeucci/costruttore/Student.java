package it.itismeucci.costruttore;

public class Student {

    private String name;
    private String surname;
    private String clazz;

    /* 
        La classe che non ha un costruttore
        fornisce il costruttore senza parametri
        (costruttore di default) senza logica
        es.: 

        public Student() {

        }
     */


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getClazz() {
        return clazz;
    }
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + ", clazz=" + clazz + "]";
    }

    
}
