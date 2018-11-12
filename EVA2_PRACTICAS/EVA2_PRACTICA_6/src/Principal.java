
import java.util.Scanner;

/*
 * Práctica 6 - Determinar cuadrante de coordenadas.
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
        System.out.print("Ingrese el valor en X de la coordenada: ");
        int x = input.nextInt();
        System.out.print("Ingrese el valor en y de la coordenada: ");
        int y = input.nextInt();
        if(x>0 && y>0){
            System.out.println("Cuadrante 1.");
        }else if(x<0 && y>0){
            System.out.println("Cuadrante 2.");
        }else if(x<0 && y<0){
            System.out.println("Cuadrante 3.");
        }else{
            System.out.println("Cuadrante 4.");
        }
    }
    
}
