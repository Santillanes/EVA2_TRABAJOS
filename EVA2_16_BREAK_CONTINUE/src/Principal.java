/*
 * Práctica 16 - Break continue
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
        
        //for: No manipulamos la variable contador
        //DETENDREMOS CUANTO UN NÚMERO SEA DIVISIBLE ENTRE 5
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            int res = i%5;
            if(res == 0){
                break; //INTERRUMPE LA LÓGICA DEL PROGRAMA
            }
        }
        System.out.println("---------------------------------------------");
        //CONTINUE;
        //IMPRIMIR LOS NÚMEROS NO DIVISIBLES ENTRE 5
        for (int i = 1; i <= 10; i++) {
            int resi = i%5;
            if(resi == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
