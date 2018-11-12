/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ACUMULADOR
        int iSuma = 0; //PUNTO DE PARTIDA
        System.out.println("Valor de suma: "+iSuma);
        iSuma = iSuma + 10; //0+10
        System.out.println("Valor de suma: "+iSuma);
        iSuma = iSuma + 10;
        System.out.println("Valor de suma: "+iSuma);
        iSuma += 10;
        System.out.println("Valor de suma: "+iSuma);
        //MULTIPLICACION
        int iMulti = 1;
        System.out.println("Valor de iMulti = "+iMulti);
        iMulti = iMulti *5;
        System.out.println("Valor de iMulti = "+iMulti);
        iMulti *= 5;
        System.out.println("Valor de iMulti = "+iMulti);
        //RESTA
        int iResta = 100;
        System.out.println("Valor de Resta: "+iResta);
        iResta = iResta - 5;
        System.out.println("Valor de Resta: "+iResta);
        iResta -= 5;
        System.out.println("Valor de Resta: "+iResta);
        
        //CONTADOR
        //TIPO EPECIAL DE ACUMULADOR
        int iCont = 0;
        System.out.println("Cuanto tienes = "+iCont);
        iCont = iCont +1;
        System.out.println("Cuanto tienes = "+iCont);
        iCont = iCont +1;
        System.out.println("Cuanto tienes = "+iCont);
        iCont += 1;   //INCREMENTA EN CUALQUIER VALOR, en este caso, 1
        System.out.println("Cuanto tienes = "+iCont);
        iCont ++;
        System.out.println("Cuanto tienes = "+iCont);
        //TE CASTIGARON Y TE QUITARON DINERO
        iCont --;
        System.out.println("Cuanto tienes = "+iCont);
        
        String sCade = "Hola";
        System.out.println(sCade);
        sCade = sCade + " Mundo";
        System.out.println(sCade);
        sCade += " QUIUBO";
        System.out.println(sCade);      //NO SE PUEDE RESTAR
        System.out.println("**************");
        System.out.println("Valor de iCont = "+iCont);
        System.out.println("Valor de iCont = "+(iCont++));
        System.out.println("Valor de iCont = "+(++iCont));
        //iCont++ --> Se aplica después.
        //++iCont --> Se aplica al momento.
        
        System.out.println("****************");
        iCont++;
        System.out.println("Valor de iCont = "+iCont);
        ++iCont;
        System.out.println("Valor de iCont = "+iCont);
        
    }
    
}
