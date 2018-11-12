
import java.util.Scanner;

/*
 * Practica 8 - Tipo de triangulo
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
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la medida del primer lado del triángulo: ");
        double l1 = input.nextDouble();
        System.out.print("Introduce la medida del segundo lado del triángulo: ");
        double l2 = input.nextDouble();
        System.out.print("Introduce la medida del tercer lado del triángulo: ");
        double l3 = input.nextDouble();
        
        if(l1<=0 || l2<=0 || l3<=0){
            System.out.println("Medidas incorrectas.");
        }else{
            if(l1==l2 && l1==l3){
                System.out.println("Triángulo equilatero.");
            }else if(l1==l2 && l1!=l3){
                System.out.println("Triángulo isósceles.");
            }else if(l2==l3 && l2!=l1){
                System.out.println("Triángulo isósceles.");
            }else if(l1==l3 && l1!=l2){
                System.out.println("Triángulo isósceles.");
            }else{
                System.out.println("Triángulo escaleno.");
            }
        }
        
        
    }
    
}
