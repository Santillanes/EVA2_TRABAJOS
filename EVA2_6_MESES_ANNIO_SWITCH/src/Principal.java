
import java.util.Scanner;

/*
 * Meses - Annio - Switch
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
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número de un mes: ");
        int n = input.nextInt();
        
        switch(n){
            //OPCIONES
            case 1: //PRIMER CASO --> ENERO
                System.out.println("Enero");
                break; //TERMINA EL CASO
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Novimbre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default: //SI NO ENTRA EN NINGÚN CASO
                System.out.println("No corresponde con ningún mes.");
        }
        //AQUI NOS MANDA EL BREAK
    }
    
}
