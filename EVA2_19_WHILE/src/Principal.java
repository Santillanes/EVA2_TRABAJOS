
import java.util.Scanner;

/*
 * Ciclo While
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
        Scanner input = new Scanner (System.in);
        String sCade = "";
        while(!sCade.equals("X")){
            System.out.println("Introduce un mensaje (X para salir):");
            sCade = input.nextLine();
            System.out.println("Tu mensaje: "+sCade);
        }
    }
    
}
