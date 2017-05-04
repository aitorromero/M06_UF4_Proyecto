package m06_uf4_proyecto;

import Utilitats.CursNom;
import Utilitats.MatriculaDescompte;
import Utilitats.MatriculaModalitats;
import controllers.Alumne_Controller;
import controllers.Curs_Controller;
import controllers.Matricula_Controller;
import controllers.Unitat_Controller;
import elementos.Alumne;
import elementos.Curs;
import elementos.Matricula;

public class M06_UF4_Proyecto {

    public static void main(String[] args) {
        
        Alumne_Controller ac = new Alumne_Controller();
        Unitat_Controller uc = new Unitat_Controller();
        Matricula_Controller mc = new Matricula_Controller();
        Curs_Controller cc = new Curs_Controller();
        
        
        
        
        Alumne a = new Alumne("Alejnardo", "Verga","correo@corr.cor",0,null);
        
        Matricula matri = new Matricula(ac.Buscar(401L), "01/09/2016", null, MatriculaDescompte.cursComplet, MatriculaModalitats.total);
        
        Curs c = new Curs(CursNom.primer, null);
        
        
        Curs c1 = new Curs(CursNom.segon, null);
        
      
        
        
        //matri.setAlumne(a);
        //a.setMatriculaAlumne(matri);
        //UnitatFormativa uf1 = new UnitatFormativa("Historia de un historiador", 30, null, null, null);
        
        //UnitatFormativa uf2 = new UnitatFormativa("Presente de un presentador", 33, null, null, null);
        //UnitatFormativa uf3 = new UnitatFormativa("Futuro de un historiador version Extendida", 20, null, null, null);
        
        //ac.insertar(a);
    
        mc.insertar(matri);
        
        
        //mc.modificar(matri);
        
        
        //cc.insertar(c1);
        
     
        
        
        
        
        
        
        
        
        
    }

}











