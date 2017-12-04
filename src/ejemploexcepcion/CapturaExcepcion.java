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
public class CapturaExcepcion {
    private int numerador;
    private int denominador;

    public CapturaExcepcion() {
    }
    
    public void dividirCaptura(){
       
        
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador"));

        try{
        int resultado = numerador/denominador;
        JOptionPane.showConfirmDialog(null,numerador+" / "+denominador+" = "+ resultado);
        }catch(ArithmeticException e){        
            JOptionPane.showConfirmDialog(null, "No se puede dividir entre "+ denominador); 
            //JOptionPane.showConfirmDialog(null, e.printStackTrace());
        }
    }
    
    
}
