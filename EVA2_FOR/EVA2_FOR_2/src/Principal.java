
import java.util.Scanner;

/*
 * Práctica 2 FOR
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
        System.out.print("Introduzca el número de repeticiones: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+". Luis Carlos Santillanes Loya");
        }
    }
    
}
