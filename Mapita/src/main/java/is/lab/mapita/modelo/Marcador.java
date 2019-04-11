package is.lab.mapita.modelo;
// Generated 08-feb-2019 13:44:51 by Hibernate Tools 4.3.1

import is.lab.mapita.modelo.Usuario;




/**
 * Marcador generated by hbm2java
 */
public class Marcador  implements java.io.Serializable {

     private int idmarcador;
     private Usuario usuario;
     private String descripcion;
     private double longitud;
     private double latitud;
     private String icon;

    public Marcador() {
    }

    public Marcador(int idmarcador, String descripcion, double longitud, double latitud, String icon) {
        this.idmarcador = idmarcador;
        this.descripcion = descripcion;
        this.longitud = longitud;
        this.latitud = latitud;
        this.icon = icon;
    }

    public Marcador(int idmarcador, Usuario usuario, String descripcion, double longitud, double latitud, String icon) {
        this.idmarcador = idmarcador;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.longitud = longitud;
        this.latitud = latitud;
        this.icon = icon;
    }

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    
}