
import java.util.Scanner;

/*
 * Meses - Annio
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
        System.out.print("Introduce un número de un mes: ");
        int n = input.nextInt();
        if(n == 1){
            System.out.println("Enero.");
        }else if(n == 2){
            System.out.println("Febrero.");
        }else if(n == 3){
            System.out.println("Marzo.");
        }else if(n == 4){
            System.out.println("Abril.");
        }else if(n == 5){
            System.out.println("Mayo.");
        }else if(n == 6){
            System.out.println("Junio.");
        }else if(n == 7){
            System.out.println("Julio.");
        }else if(n == 8){
            System.out.println("Agosto.");
        }else if(n == 9){
            System.out.println("Septiembre.");
        }else if(n == 10){
            System.out.println("Octubre.");
        }else if(n == 11){
            System.out.println("Noviembre.");
        }else if(n == 12){
            System.out.println("Diciembre.");
        }else{
            System.out.println("Número no correspondiente a un mes.");
        }
    }
    
}
