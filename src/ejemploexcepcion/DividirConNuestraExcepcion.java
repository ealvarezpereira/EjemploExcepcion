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
public class DividirConNuestraExcepcion {

    private int numerador;
    private int denominador;

    public DividirConNuestraExcepcion() {
    }

    public void divConNuestraExcepcion() throws NuestraExcepcion {

        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador"));

        if (denominador == 0) {
            throw new NuestraExcepcion("No dividas entre 0 merluzo");
        }
        System.out.println("Resultado= " + numerador / denominador);

    }

}
