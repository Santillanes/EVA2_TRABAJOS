
import java.util.Scanner;

/*
 * Práctica 10 - Curso de estudiante.
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
        System.out.print("Introduce la calificación de matemáticas: ");
        int m = input.nextInt();
        System.out.print("Introduce la calificación de física: ");
        int f = input.nextInt();
        System.out.print("Introduce la calificación de química: ");
        int q = input.nextInt();
        
        int tot=m+f+q;
        if((m>=65 && f>=55 && q>=50 && tot>=180) || (m>=65 && tot>=140)){
            System.out.println("El candidato es elegible para el curso.");
        }else{
            System.out.println("El candodato NO es elegible para el curso.");
        }
    }
    
}
