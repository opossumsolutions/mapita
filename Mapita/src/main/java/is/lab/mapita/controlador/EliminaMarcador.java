/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Marcador;
import is.lab.mapita.modelo.MarcadorDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author opossum
 */
@ManagedBean
public class EliminaMarcador {
    
    private int idmarcador;

    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    
    
    
    public void eliminaMarcador(){
        
    MarcadorDAO udb = new MarcadorDAO();
    Marcador marcador = udb.find(idmarcador);
    udb.delete(marcador);
    
    }
    

}
