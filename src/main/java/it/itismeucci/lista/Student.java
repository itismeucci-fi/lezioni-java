package it.itismeucci.lista;

/**
 * Classe studente 
 * @author prof scialpi
 */
public class Student {

    private long id;

    private String name;
    private String surname;

    private static long IDGENERATOR = 1;
    
    /**
     * Il costruttore non prende in input l'id poichè è calcolata in automatico come progressivo
     * @param name il nome dello studente
     * @param surname il congnome dello studente
     */
    public Student(String name, String surname) {
        this.id = IDGENERATOR;
        IDGENERATOR++;
        this.name = name;
        this.surname = surname;
    }
    public long getId() {
        return id;
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
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}
