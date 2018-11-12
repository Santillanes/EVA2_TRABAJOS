/*
 * Carrera 2
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
        boolean matTer = true;
        boolean servSoc = true;
        boolean resi = true;
        if(matTer && servSoc && resi){
            System.out.println("Si se puede titular.");
        }else{
            System.out.println("No se puede titular.");
        }
    }
    
}
