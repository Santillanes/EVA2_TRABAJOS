
import java.util.Scanner;

/*
 * Práctica 17 - Encontrar número
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
        //Genera números dobles entre 0-->1
        int NumAlea = (int)(Math.random()*10)+1;
        //System.out.println("Número: "+NumAlea);
        for (int i = 0; i < 3; i++) {
            System.out.print("Adivina el número: ");
            int n = input.nextInt();
            if(n == NumAlea){
                System.out.println("Felicidades, ganaste!");
                break;
            }
            if(i == 2){
                System.out.println("Perdiste!");
            }
        }
    }
    
}
