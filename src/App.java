

public class App {
    public static void main(String[] args) throws Exception {
        
        Giocatore g1 = new Giocatore("Riccardo");
        Giocatore g2 = new Giocatore("Fravio");
        Giocatore g3 = new Giocatore("Francesco");

        System.out.println("****Parita Iniziata****");
        g1.start();
        g2.start();
        g3.start();

        g1.join();
        g2.join();
        g3.join();

        if (!(g1.getCarta() == g2.getCarta() && g3.getCarta() < g2. getCarta() || g1.getCarta() == g3.getCarta() && g2.getCarta() < g3. getCarta() || g2.getCarta() == g3.getCarta() && g1.getCarta() < g3. getCarta() || g1.getCarta() == g2.getCarta() && g2.getCarta() == g3.getCarta()))
        {
            if (g1.getCarta() > g2.getCarta())
        {
            if (g1.getCarta() > g3.getCarta())
                System.out.println("Il vincitore è: " + g1.getNome());
            else
                System.out.println("Il vincitore è: " + g3.getNome());
        }
        else if (g2.getCarta() > g3.getCarta())
            System.out.println("Il vincitore è: " + g2.getNome());
        else
            System.out.println("Il vincitore è: " + g3.getNome());
        }
        else if (g1.getCarta() == g2.getCarta() && g2.getCarta() == g3.getCarta())
            System.out.println("Tutti hanno pareggiato");
        else if(g1.getCarta() == g2.getCarta())
            System.out.println("I giocatori " + g1.getNome() +" e " + g2.getNome() + " hanno pareggiato");
        else if(g1.getCarta() == g3.getCarta())
            System.out.println("I giocatori " + g1.getNome() +" e " + g3.getNome() + " hanno pareggiato");
        else
            System.out.println("I giocatori " + g2.getNome() +" e " + g3.getNome() + " hanno pareggiato");
            


        
            
        

        

        

            
            

}
}
