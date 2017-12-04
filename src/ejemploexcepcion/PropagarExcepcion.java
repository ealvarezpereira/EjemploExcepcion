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
public class PropagarExcepcion {
    
    private int numerador;
    private int denominador;

    public PropagarExcepcion() {
    }
    
    public void dividirPropagaExcepcion()throws ArithmeticException{
        
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador"));
    
        if (denominador == 0){
            throw new ArithmeticException("<-No se puede dividir entre 0->");
        }
            System.out.println("Resultado= " + numerador/denominador);
        
    
    }
    
}
