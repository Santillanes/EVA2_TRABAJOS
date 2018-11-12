
import java.util.Scanner;

/*
 * Calcular medias con acumuladores
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
        double co = 0;
        double edades = 0;
        System.out.print("Ingrese la primer edad: ");
        edades += input.nextDouble();
        co++;
        System.out.print("Ingrese la segunda edad: ");
        edades += input.nextDouble();
        co++;
        System.out.print("Ingrese la tercer edad: ");
        edades += input.nextDouble();
        co++;
        System.out.print("Ingrese la cuarta edad: ");
        edades += input.nextDouble();
        co++;
        System.out.print("Ingrese la quinta edad: ");
        edades += input.nextDouble();
        co++;
        
        double media = ((edades)/co);
        System.out.println("La media de esas edades es: "+media);
    }
    
}
