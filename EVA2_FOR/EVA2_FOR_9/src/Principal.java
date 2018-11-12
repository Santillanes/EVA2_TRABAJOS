/*
 * Práctica 9 FOR
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
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+", ");
            sum += i;
        }
        System.out.println("\nLa sumatiora es: "+sum);
    }
    
}
