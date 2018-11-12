
import java.util.Scanner;

/*
 * Práctica 4 - Número mayor, igual o menor que cero.
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
        System.out.print("Introduzca un número: ");
        int n = input.nextInt();
        if(n>0){
            System.out.println("1");
        }else if(n == 0){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }
    }
    
}
