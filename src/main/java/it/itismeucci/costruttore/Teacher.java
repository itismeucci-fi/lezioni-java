package it.itismeucci.costruttore;

public class Teacher {
    private String name;
    private String surname;
    private Double salary;

    /* 
        Se la classe ha un costruttore
        allora il costruttore senza parametri
        (costruttore di default) senza logica
        non è disponibile
     */
    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
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
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Teacher [name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
    }
    
}
