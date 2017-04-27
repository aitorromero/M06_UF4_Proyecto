package m06_uf4_proyecto;

import controllers.Alumne_Controller;
import elementos.Alumne;

public class M06_UF4_Proyecto {

    public static void main(String[] args) {
        
        Alumne_Controller ac = new Alumne_Controller();
        
        
        
        Alumne a = new Alumne(20000000L, "Alejnardo", "Verga", "correoentucara@gmail.com",777666888);
        
        ac.Insertar(a);
    
        
        
        
    
    }

}
