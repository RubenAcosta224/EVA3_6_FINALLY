/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_finally;

/**
 *
 * @author invitado
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=9,y=0;
        
        try {
            int res=x/y;
            System.out.println("Resultado: "+res);
        } catch (ArithmeticException e) {
            System.out.println("no se divide entre 0 ");
        }
        finally{
            System.out.println("Siempre se ejecta: ");
        }
    }
    
}
