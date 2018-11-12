/*
 * Práctica 8 FOR
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
        for (int i = 1; i <= 20; i++) {
            double n = Math.random()*100+1;
            System.out.println(i+". "+(int)n);
        }
    }
    
}
