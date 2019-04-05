/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.modelo;

/**
 *
 * @author juan
 */
public class Comentario implements java.io.Serializable{
    

     private int idcomentario;
     private Marcador marcador;
     private Usuario usuario;
     private String comentario;
     
    public Comentario() {
    }

	
    public Comentario(int idcomentario, String comentario) {
        this.idcomentario = idcomentario;
        this.comentario = comentario;
    }
    
    public Comentario(int idcomentario, Usuario usuario,Marcador marcador, String comentario) {
       this.idcomentario = idcomentario;
       this.marcador = marcador;
       this.usuario= usuario;
       this.comentario = comentario;
    }

    public int getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public Marcador getMarcador() {
        return marcador;
    }

    public void setMarcador(Marcador marcador) {
        this.marcador = marcador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}
