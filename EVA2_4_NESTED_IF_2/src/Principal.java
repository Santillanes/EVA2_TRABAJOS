
import java.util.Scanner;

/*
 * Nested_if_2
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
        System.out.print("Introduce tu calificación: ");
        int ca = input.nextInt();
        
        
        
        if(ca == 100){
            System.out.println("A");
        }else if((ca >= 90) && (ca <100)){
            System.out.println("B");
        }else if((ca >= 80) && (ca <90)){
            System.out.println("C");
        }else if((ca >= 70) && (ca <80)){
            System.out.println("D");
        }else if((ca >= 0) && (ca <70)){
            System.out.println("F");
        }else{
            System.out.println("Fuera de rango");
        }
    }
    
}
