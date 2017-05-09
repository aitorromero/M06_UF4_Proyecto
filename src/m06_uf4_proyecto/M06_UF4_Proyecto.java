package m06_uf4_proyecto;

import Utilitats.CursNom;
import Utilitats.MatriculaDescompte;
import Utilitats.MatriculaModalitats;
import controllers.Alumne_Controller;
import controllers.Cicle_Controller;
import controllers.Curs_Controller;
import controllers.Matricula_Controller;
import controllers.Unitat_Controller;
import elementos.Alumne;
import elementos.Cicle;
import elementos.Curs;
import elementos.Matricula;
import elementos.UnitatFormativa;
import java.util.ArrayList;
import java.util.List;

public class M06_UF4_Proyecto {

    public static void main(String[] args) {
        
        Alumne_Controller ac = new Alumne_Controller();
        Unitat_Controller uc = new Unitat_Controller();
        Matricula_Controller mc = new Matricula_Controller();
        Curs_Controller cc = new Curs_Controller();
        Cicle_Controller clc = new Cicle_Controller();
        
        
        
        //Curs c1 = new Curs(CursNom.primer, null);
        
        
        //cc.insertar(c1);
        Alumne a1 = new Alumne(78946987L, "Capità", "Calçotets", "csdadorreo",12875);
        
        ac.insertar(a1);
               
        
        //Matricula matri = new Matricula(ac.Buscar(761L), "11/08/2014", null, MatriculaDescompte.ufsSotes, MatriculaModalitats.total);
        
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











