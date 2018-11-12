
import java.util.Scanner;

/*
 * Annio bisiesto 2
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
        System.out.print("Escribe un año: ");
        int annio = input.nextInt();
        int resi4 = annio%4;
        int resi100 = annio%100;
        int resi400 = annio%400;
        
        if(((resi4==0)&&!(resi100==0)) || (resi400 == 0)){
            System.out.println("Año bisiesto.");
        }else{
            System.out.println("Año NO bisiesto.");
        }
    }
    
}
