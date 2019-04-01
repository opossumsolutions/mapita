/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Usuario;
import is.lab.mapita.modelo.UsuarioDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author opossum
 */

@ManagedBean
public class EliminaUsuario {
    private int idusuario;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void eliminaUsuario(){
        
        UsuarioDAO udb = new UsuarioDAO();
        Usuario usuario = udb.find(idusuario);
        udb.delete(usuario);
    }
   
}
