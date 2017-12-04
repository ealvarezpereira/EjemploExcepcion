/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class ConFinally {

    private int numerador;
    private int denominador;
    
    public ConFinally() {
    }
    
     public void dividirConFinally(){
        try{
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador"));
        
        int resultado = numerador/denominador;
        JOptionPane.showConfirmDialog(null,numerador+" / "+denominador+" = "+ resultado);
        }catch(ArithmeticException e1){        
            JOptionPane.showConfirmDialog(null, "Error 1. No se puede dividir entre "+ denominador); 
            //JOptionPane.showConfirmDialog(null, e.printStackTrace());
        } catch(NumberFormatException e2){        
            System.out.println("Error2. No se puede poner una letra "+e2.toString());
        } finally{
        
            System.out.println("Esta sentencia siempre se ejecuta");
        }
    
    
}

}
