/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepcion;

/**
 *
 * @author quique
 */
public class NuestraExcepcion extends Exception {

    public NuestraExcepcion() {
        super("Informacion de la excepcion");
    }

    public NuestraExcepcion(String mensaje) {
        super(mensaje);
    }
    
    
    
}
