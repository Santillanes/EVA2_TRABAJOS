
import java.util.Scanner;

/*
 * Primo con ciclo for
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
        System.out.print("Ingrese un número: ");
        int n = input.nextInt();
        int cont = 0;
        for (int i = n; i > 0; i--) {
            if(n % i == 0){
                cont++;
            }
        }
        if(cont == 2){
            System.out.println("Número primo.");
        }else{
            System.out.println("Número no primo.");
        }
    }
    
}
