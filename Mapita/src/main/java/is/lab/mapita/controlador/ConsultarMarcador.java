/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Marcador;
import is.lab.mapita.modelo.MarcadorDAO;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author opossum
 */
public class ConsultarMarcador {
    public List<Marcador> consultarMarcador(){
        MarcadorDAO udb = new MarcadorDAO();
        return udb.findAll();
    }
    
}
