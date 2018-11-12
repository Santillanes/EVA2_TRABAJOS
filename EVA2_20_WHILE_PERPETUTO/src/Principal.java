
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Práctica 20 - While Perpetuo
 */

/**
 *
 * @author Luis Carlos Santillanes Loya - 18550694
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            System.out.println("Si ves este mensaje, se trabo tu progama");
            try {
                Thread.sleep(1000);  //Demora la ejecución del programa
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
