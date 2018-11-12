
import java.util.Scanner;

/*
 * DIAS - SEMANA - SWITCH
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
        System.out.print("Ingresa un número del día de semana: ");
        int n = input.nextInt();
        switch (n){
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Lunes.");
                break;
            case 3:
                System.out.println("Martes.");
                break;
            case 4:
                System.out.println("Miercoles.");
                break;
            case 5:
                System.out.println("Jueves.");
                break;
            case 6:
                System.out.println("Viernes.");
                break;
            case 7:
                System.out.println("Sabado.");
                break;            
            default:
                System.out.println("Número no correspondiente a un día de la semana.");
                break;            
        }
                
    }
    
}
