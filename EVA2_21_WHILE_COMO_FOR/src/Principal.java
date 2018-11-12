/*
 * Práctica 21 - While como For
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
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" - ");
        }
        System.out.println("");
        int iWhile = 1;
        while(iWhile <= 10){
            System.out.print(iWhile+" - ");
            iWhile++;
        }
        
    }
    
}
