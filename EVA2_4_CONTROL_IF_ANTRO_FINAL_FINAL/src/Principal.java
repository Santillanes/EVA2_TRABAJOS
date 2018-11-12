
import java.util.Scanner;

/*
 * If Antro - Final Final
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
        
        System.out.println("¿Cuál es tu edad?");
        int Edad = input.nextInt();
        System.out.println("¿Tienes INE?");
        boolean INE = input.nextBoolean();
        
        if((Edad >= 18) && (INE == true)){
            System.out.println("ADELANTE!");
        }else{
            System.out.println("NO ENTRAS!");
        }
    }
    
}
