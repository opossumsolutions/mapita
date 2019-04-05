/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author juan
 */
public class ComentarioDAO extends AbstractDAO<Comentario>{
    /**
     * 
     */
    public ComentarioDAO(){
        super();
    }
    
    
    /**
     * 
     * @param comentario 
     */
    @Override
    public void save(Comentario comentario){
        super.save(comentario);
    }
    
    /**
     * 
     * @param comentario 
     */
    @Override
    public void update(Comentario comentario){
        super.save(comentario);
    }
    
    /**
     * 
     * @param comentario 
     */
    @Override
    public void delete(Comentario comentario){
        super.delete(comentario);
    }
       
    /**
     * 
     * @param id
     * @return 
     */
    public Comentario find(int id){
        return super.find(Comentario.class, id);
    }
    
    /**
     * 
     * @return 
     */
    public List<Comentario> findAll(){
        return super.findAll(Comentario.class);
    }
        
    public List<Comentario> ObtenComentariosPorUsuario(String correo){
        List<Comentario> m = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "from Comentario m where m.usuario.correo = :correo";
            Query query = session.createQuery(hql);
            query.setParameter("correo", correo);
            m = (List<Comentario>)query.list();
            tx.commit();
            
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();

        }finally{
            session.close();
        }
        return m;
    }
    
    public List<Comentario> ObtenComentariosPorMarcador(double lat,double lng){
        List<Comentario> m = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "from Comentario m where m.marcador.longitud = :lng and m.marcador.latitud = :lat";
            Query query = session.createQuery(hql);
            query.setParameter("lng", lng);
            query.setParameter("lat", lat);
            m = (List<Comentario>)query.list();
            tx.commit();
            
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();

        }finally{
            session.close();
        }
        return m;
    }
}
