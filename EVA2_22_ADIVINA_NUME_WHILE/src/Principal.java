
import java.util.Scanner;

/*
 * Práctica 22 - Un while que no se detenga hasta que el usuario adivine el número entre 1 y 10.
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
        double n = Math.random()*10+1;
                        System.out.println("El número es: "+(int)n);
        int num = 0;
        while(!(num == (int)n)){
            System.out.println("Introduce un número entre 1 y 10:");
            num = input.nextInt();
        }
    }
    
}
