
import java.util.Scanner;

/*
 * Práctica 7 - Temperatura
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
        System.out.print("Introduce la temperatura en grados centígrados: ");
        double t = input.nextDouble();
        if(t<0){
            System.out.println("Freezing weather.");
        }else if(t<=10){
            System.out.println("Very cold weather.");
        }else if(t<=20){
            System.out.println("Cold weather.");
        }else if(t<=30){
            System.out.println("Normal in temp.");
        }else if(t<40){
            System.out.println("Its hot.");
        }else{
            System.out.println("Its very hot.");
        }
    
    }
    
}
