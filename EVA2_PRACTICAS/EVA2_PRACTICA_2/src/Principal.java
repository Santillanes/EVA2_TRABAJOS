
import java.util.Scanner;

/*
 * Practica 2 - Número par o impar.
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
        System.out.print("Introduce un número: ");
        int n = input.nextInt();
        if(n%2 == 0){
            System.out.println("Número par.");
        }else{
            System.out.println("Número impar.");
        }
    }
    
}
