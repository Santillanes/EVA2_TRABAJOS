
import java.util.Scanner;

/*
 * Practica 5 - El mayor de tres números
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
        System.out.print("Introduce el primer número: ");
        int n1 = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = input.nextInt();
        System.out.print("Introduce el tercer número: ");
        int n3 = input.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("El número mayor es: "+n1);
        }else if(n2>n1 && n2>n3){
            System.out.println("El número mayor es: "+n2);
        }else{
            System.out.println("El número mayor es: "+n3);
        }
    }
    
}
