
import java.util.Scanner;

/*
 * Práctica 11 FOR
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
        for (int i = 1; i <= 100; i++) {
            if(i%n != 0){
                System.out.println(i);
            }
        }
    }
    
}
