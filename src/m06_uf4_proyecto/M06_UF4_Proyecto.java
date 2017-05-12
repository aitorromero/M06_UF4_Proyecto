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
import controllers.Modul_Controller;
import controllers.Unitat_Controller;
import elementos.Alumne;
import elementos.Cicle;
import elementos.Curs;
import elementos.Familia;
import elementos.Matricula;
import elementos.Modul;
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
        Modul_Controller mdc = new Modul_Controller();

        Alumne a1 = new Alumne(92346987L, "¡Hilo jeje", "Casd", "csfadfasreo",19875);
        
        ac.insertar(a1);
        /////////////////////////////////////////////////////////////////////meter alumno
//        
//        Familia f = new Familia("Familia familiosa");
//        
//        fc.insertar(f);
//        
        ////////////////////////////////////////////////////////////////meter familia
//        
//        Familia f = fc.Buscar(1481L);
//        fc.modificar(f);
//        
//        Cicle c1 = new Cicle("El ciclito no3", "IV grado",null );
//        c1.setFamilia(f);
//        clc.modificar(c1);
//        
//        
//        //clc.modificar(c1);
//        fc.tancarEM();
//        
//        clc.tancarEM();
        ////////////////////////////////////////////////////////////meter ciclo
//        
//        Cicle c1 = clc.Buscar(1661L);
//        
//        Curs cursillo = new Curs(CursNom.primer, c1);
//        
//        
//        cc.modificar(cursillo);
//        
//        clc.tancarEM();
//        
        ////////////////////////////////////////////////////////////////meter cicle
//        Modul m1 = new Modul( "Modulo modular II");
//        
//        mdc.insertar(m1);
////        
//        Modul m1 = mdc.Buscar(1721L);
//        m1.setCicle(clc.Buscar(1661L));
//        
//        mdc.modificar(m1);
//
//        
//        m1.setCurs(cc.Buscar(1701L));
//
//        mdc.modificar(m1);
//        
//        
//        cc.tancarEm();
//        clc.tancarEM();
        ///////////////////////////////////////////////////meter modul

//        UnitatFormativa uf1 = new UnitatFormativa("Uf superguay 2 ", 23, null, null, null);
//        
//        uc.insertar(uf1);
//        
//        Curs c1 = cc.Buscar(1701L);
//        uf1.setCurs(c1);
//        
//        uc.modificar(uf1);
//        
//        Modul m1 = mdc.Buscar(1721L);
//        uf1.setModul(m1);
//        
//        uc.modificar(uf1);
//        
//        cc.tancarEm();
//       
//        mdc.tancarEM();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //uf1.setCurs(cc.Buscar(1261L));
        //uf1.setModul(mdc.Buscar(1381L));
        //uc.modificar(uf1);
        //mdc.tancarEM();
        //cc.tancarEm();
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
