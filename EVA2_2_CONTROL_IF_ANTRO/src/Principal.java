
import java.util.Scanner;

/*
 * If antro - Edad
 */

/**
 *
 * @author Luis Santillanes - 18550694
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("¿Cuál es tu edad?");
        int Edad = input.nextInt();
        if(Edad >= 18){
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("NO es mayor de edad.");
        }
    }
    
}
