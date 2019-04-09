/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;


import is.lab.mapita.modelo.Rol;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author juan
 */
@WebFilter("/informador/*")
public class FilterSessionInformador implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession(true);
         if (session.getAttribute("user") == null) {
            res.sendRedirect(req.getContextPath() + "/index.xhtml"); // Si no se encuentra el usuario redire al index.
        }
        else {
            ControladorSesion.UserLogged u = (ControladorSesion.UserLogged) session.getAttribute("user");
            if(u.getRol()==Rol.INFORMADOR){
                chain.doFilter(req, res); // esta logueado se continua con lo que se solicito.
            }else{
                res.sendRedirect(req.getContextPath() + "/index.xhtml");
            }
        }
    }

    @Override
    public void destroy() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
