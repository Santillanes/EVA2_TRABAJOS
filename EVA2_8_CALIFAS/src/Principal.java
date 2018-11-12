
import java.util.Scanner;

/*
 * Califas - switch
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
        System.out.print("Ingresa tu calificación en letra: ");
        String c = input.nextLine();
        switch (c){
            case "A":
                System.out.println("100");
                break;
            case "B": 
                System.out.println("90");
                break;
            case "C":
                System.out.println("80");
                break;
            case "D":
                System.out.println("70");
                break;
            case "F":
                System.out.println("0");
                break;
            default:
                System.out.println("Fuera de rango.");
            }
    }
    
}
