
import java.util.Scanner;

/*
 * Práctica 15 - Media con for
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
        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Edad "+i+": ");
            sum += input.nextDouble();
        }
        double media = sum/5;
        System.out.println("La media es: "+media);
    }
    
}
