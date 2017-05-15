/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import javax.swing.JOptionPane;

public class ExcepcionGeneral extends Exception {


    public ExcepcionGeneral(String message) {
//        super(message);
  //      mensaje = (message.equals("COG")) ? "No s'ha trobat cap alumne amb aquest cognom" : "No se han trobat resultats";

    //    JOptionPane.showMessageDialog(null, mensaje);
    }
    /**
     * Constructor de sobrecarga.
     */
    public ExcepcionGeneral() {
        
    }
    
    public void ExcepcionStringEnNumero (String texto){
        
        JOptionPane.showMessageDialog(null, "Has intentado meter un campo de text en uno numerico : " + texto);
    }

}