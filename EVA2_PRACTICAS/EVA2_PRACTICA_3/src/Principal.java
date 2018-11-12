
import java.util.Scanner;

/*
 * Practica 3 - Número positivo o negativo.
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
        double n = input.nextDouble();
        if(n>0){
            System.out.println("Número positivo.");
        }else if(n<0){
            System.out.println("Número negativo.");
        }else{
            System.out.println("No es positivo ni negativo.");
        }
            
                
    }
    
}
