/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.modelo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author juan
 */
public class Tema implements java.io.Serializable{
    private int idtema;
    private Usuario usuario;
    private String color;
    private String nombre;
    private Set marcadors = new HashSet(0);

    public Tema() {
    }

	
    public Tema(int idtema, String nombre, String color) {
        this.idtema = idtema;
        this.nombre = nombre;
        this.color = color;
    }
    public Tema(int idtema, Usuario usuario, String nombre, String color, Set marcadors) {
       this.idtema = idtema;
       this.usuario = usuario;
       this.nombre = nombre;
       this.color = color;
       this.marcadors = marcadors;
    }

    public void setIdtema(int idtema) {
        this.idtema = idtema;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarcadors(Set marcadors) {
        this.marcadors = marcadors;
    }

    public int getIdtema() {
        return idtema;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public Set getMarcadors() {
        return marcadors;
    }
    
    

}
