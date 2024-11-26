package it.itismeucci.json;

import java.util.Date;

// Classe modello
class Persona {
    private String nome;
    private int eta;
    private Date dataNascita;
    private String email;

    // Costruttori
    public Persona() {
    }

    public Persona(String nome, int eta, String email) {
        this.nome = nome;
        this.eta = eta;
        this.email = email;
        this.dataNascita = new Date();
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", email='" + email + '\'' +
                '}';
    }
}
