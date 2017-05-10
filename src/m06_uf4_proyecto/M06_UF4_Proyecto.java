package m06_uf4_proyecto;

import Utilitats.CursNom;
import Utilitats.MatriculaDescompte;
import Utilitats.MatriculaModalitats;
import controllers.Alumne_Controller;
import controllers.Cicle_Controller;
import controllers.Curs_Controller;
import controllers.EM_Controller;
import controllers.Familia_Controller;
import controllers.Matricula_Controller;
import controllers.Unitat_Controller;
import elementos.Alumne;
import elementos.Cicle;
import elementos.Curs;
import elementos.Familia;
import elementos.Matricula;
import elementos.UnitatFormativa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

public class M06_UF4_Proyecto {

    public static void main(String[] args) {
        
        Alumne_Controller ac = new Alumne_Controller();
        Unitat_Controller uc = new Unitat_Controller();
        Matricula_Controller mc = new Matricula_Controller();
        Curs_Controller cc = new Curs_Controller(); 
        Cicle_Controller clc = new Cicle_Controller();
        Familia_Controller fc = new Familia_Controller();
        
       
        Alumne a1 = new Alumne(78946987L, "Capità", "Calçotets", "csdadorreo",12875);
        
        //ac.insertar(a1);
      
        
        Familia f = new Familia("Familia familiosa");
        
        //fc.insertar(f);
        
        
        Cicle c1 = new Cicle("El ciclito no+2", "IV grado", fc.Buscar(981L));
        
        clc.insertar(c1);
        
        fc.tancarEM();
        
        clc.tancarEM();
        
//        Cicle c1 = clc.Buscar(1161L);
//        
//        c1.setFamilia(fc.Buscar(981L));
//        
//        
//        clc.modificar(c1);
//        
//        fc.tancarEM();
//        
//        clc.tancarEM();
        //Matricula matri = new Matricula(ac.Buscar(921L), "11/08/2014", 30.90, MatriculaDescompte.ufsSotes, MatriculaModalitats.total);
        
        //mc.insertar(matri);
        
        
        
       
        
        
        
        
        
        
        
        
        
        ///a.setMatriculaAlumne(mc.Buscar(601L));
        
        
        //matri.setAlumne(a);
        //a.setMatriculaAlumne(matri);
       /* UnitatFormativa uf1 = new UnitatFormativa("Historia de un historiador", 30, null, null, null);
        
        UnitatFormativa uf2 = new UnitatFormativa("Presente de un presentador", 33, null, null, null);
        UnitatFormativa uf3 = new UnitatFormativa("Futuro de un historiador version Extendida", 20, null, null, null);
        */
        /*List <Matricula> listaMatri = new ArrayList <>();
        listaMatri.add(mc.Buscar(801L));
        listaMatri.add(mc.Buscar(781L));
        
        
        UnitatFormativa uf4 = new UnitatFormativa("Unidad que forma las persona equisde", 87, listaMatri  , null, null);
        
        uc.insertar(uf4);
          */
        




//ac.insertar(a);
    
          /*  uc.insertar(uf1);
            
            uc.insertar(uf2);
            
            uc.insertar(uf3);*/
        //mc.insertar(matri);
        
        //ac.modificar(a);
        //mc.modificar(matri);
        
        
        //cc.insertar(c1);
        
     
        
        
        
        
        
        
        
        
        
    }

}











