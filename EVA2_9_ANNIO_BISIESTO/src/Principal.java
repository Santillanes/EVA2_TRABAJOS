
import java.util.Scanner;

/*
 * Annio bisiesto
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
        System.out.print("Introduce el año: ");
        int annio = input.nextInt();
        
        if((annio % 4 == 0) && !(annio % 100 == 0)){
                System.out.println("Es año bisiesto.");
            }else{
                if((annio % 4 == 0) && (annio % 100 == 0) && (annio % 400 == 0)){
                    System.out.println("Es año bisiesto.");
                }else{
                    System.out.println("NO es año bisiesto.");
                }
            }
    }
}
