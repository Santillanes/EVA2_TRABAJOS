/*
 * Carrera 1
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
        if(matTer){
            boolean servSoc = true;
            if(servSoc){
                boolean resi = true;
                if(resi){
                    System.out.println("Si se puede titular.");
                }else{
                    System.out.println("No se puede titular.");
                }
            }else{
                System.out.println("No se puede titular.");
            }
        }else{
            System.out.println("No se puede titular.");
        }
    }
    
}
