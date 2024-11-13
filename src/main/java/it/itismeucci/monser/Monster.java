package it.itismeucci.monser;

public abstract class Monster {
    /**
     * l'attacco deve essere un numero casuale compreso tra 100 e 200 (estremi inclusi)
     */
    private int attackValue;
    private int life;

    public Monster() {
        this.attackValue = (int)(Math.random() * 100 + 200);
        this.life = 500;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public boolean isAlive() {
        return this.life > 0;
    }

    public boolean isDoubleAttack() {
        return (Math.random() * 100) < getProbability();
    }


    public abstract int getProbability();

    /**
     * attacca un altro mostro e gli toglie X punti vita, 
     * dove X è il valore di attacco del mostro che sta attaccando.
     * Se la vita dell'altro mostro va a 0 (oppure al di sotto dello 0), 
     * tale mostro sarà sconfitto.
     * @param other
     * @return
     */
    public void attack(Monster other) {
        if (other.life > 0) {
            other.life -= this.attackValue;
        } else {
            // ???
        }
    }

    
    @Override
    public String toString() {
        return "Monster [attack=" + attackValue + ", life=" + life + ", alive=" + isAlive() + "]";
    }


}
