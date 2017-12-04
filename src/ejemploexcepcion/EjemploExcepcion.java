package ejemploexcepcion;

/**
 *
 * @author quique
 */
public class EjemploExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CapturaExcepcion obj1 = new CapturaExcepcion();
        //obj1.dividirCaptura();
        //VariosCap obj2 = new VariosCap();
        //obj2.dividirCapturaVariosCap();
        //ConFinally obj3 = new ConFinally();
        //obj3.dividirConFinally();
        /*PropagarExcepcion obj4 = new PropagarExcepcion();
        try{
        obj4.dividirPropagaExcepcion();
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }*/
        
        DividirConNuestraExcepcion obj5 = new DividirConNuestraExcepcion();
        
        try{
        obj5.divConNuestraExcepcion();
        }catch(NuestraExcepcion ex){
            System.out.println(ex.getMessage());
        }
    }
    
}


