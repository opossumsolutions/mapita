/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Marcador;
import is.lab.mapita.modelo.MarcadorDAO;
import is.lab.mapita.modelo.Usuario;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author opossum
 */
public class AgregaMarcador {
     private int idmarcador;
     private Usuario usuario;
     private String descripcion;
     private double longitud;
     private double latitud;

    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
    
    public void agregaMarcador() {
        Marcador m = new Marcador();
        m.setDescripcion(descripcion);
        m.setLongitud(longitud);
        m.setLatitud(latitud);
        MarcadorDAO mdb = new MarcadorDAO();
        mdb.save(m);
    }    
}
