
import java.util.Scanner;

/*
 * CONTROL DE FLUJO -> IF
 */

/**
 *
 * @author Luis Santillanes - 18550694
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("¿Qué calificación obtuviste en fundamentos de programación?");
        double calif = input.nextDouble();
        System.out.println("Tu calificación es: "+calif);
        if(calif >= 70){
            System.out.println("Ya pasaste");
        }else{
            System.out.println("Reprobaste");
        }
        
    }
    
}
