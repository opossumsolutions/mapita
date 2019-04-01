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

public class ActualizaMarcador {
    private int idmarcador;
    private String descripcion;
    private double longitud;
    private double latitud;

    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    public void actualizaMarcador(){
        MarcadorDAO mdb = new MarcadorDAO();
        Marcador m = mdb.find(idmarcador);
        m.setDescripcion(descripcion);
        m.setLatitud(latitud);
        m.setLongitud(longitud);
        mdb.update(m);
        
    }
    
    
}
