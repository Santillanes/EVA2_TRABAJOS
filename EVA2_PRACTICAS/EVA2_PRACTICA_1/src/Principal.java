
import java.util.Scanner;

/*
 * Prática 1 - Números iguales o no.
 */

/**
 *
 * @author Luis Carlos SAntillanes Loya - 18550694
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = input.nextInt();
        
        if(n1 == n2){
            System.out.println("Ambos números son iguales.");
        }else{
            System.out.println("Son diferentes números.");
        }
    }
    
}
