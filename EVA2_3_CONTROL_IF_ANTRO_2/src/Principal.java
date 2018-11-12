
import java.util.Scanner;

/*
 * If antro 2 - INE
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
        
        System.out.println("¿Tienes INE?");
        boolean INE = input.nextBoolean();
        if(INE == true){
            System.out.println("Sí tiene INE");
        }else{
            System.out.println("NO tiene INE");
        }
            
    
}
}