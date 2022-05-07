public class Giocatore extends Thread{
    
    /** 
     * Nome del giocatore
     */
    public String nome;
    /**
     * numero della carta da gioco [1-10]
     */
    public int carta;


    /**
     * Costruttore parametrico - costruisce un ogetto di tipo giocatore
     * @param nome nome giocatore
     */
    public Giocatore(String nome) 
    {
        this.nome = nome;
    }

    /**
     * Restituisce il nome di un giocatore
     * @return nome giocatore
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * imposta il nome di un giocatore
     * @param nome nome del giocatore
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restitusce il numero di una carta da gioco
     * @return numero della carta
     */
    public int getCarta() {
        return this.carta;
    }

    /**
     * Imposta il numero della carta da gioco
     * @param carta carta da gioco
     */
    public void setCarta(int carta) {
        this.carta = carta;
    }


    /**
     * Gestisce la partita stampando quando i giocatori stanno giocando, le carte che hanno pescato e il risultato finale della partita.
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -- Il giocatore " + this.nome + " sta giocando");
        setCarta((int)(Math.random() * 10) + 1);
        System.out.println("Il giocatore " + this.nome + " ha pescato la carta: " + getCarta());
    }
}
