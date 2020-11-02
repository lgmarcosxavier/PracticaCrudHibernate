package dev.lgmarcos.practicacrudhibernate.dao;

import dev.lgmarcos.practicacrudhibernate.entity.Persona;
import dev.lgmarcos.practicacrudhibernate.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lgmar
 */
public class PersonaDAO {

    public PersonaDAO() {
    }
    
    public void consultarEmpleados(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Persona> personas = session.createQuery("from Persona", Persona.class).list();
            personas.forEach(p -> System.out.println(p));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void registrarEmpleados(){
        Persona persona1 = new Persona("Marcos", "Lopez");
        Persona persona2 = new Persona("Mauricio", "Aguirre");
        
        Transaction transaction = null;
        
        
        try ( Session session = HibernateUtil.getSessionFactory().openSession() ){
            transaction = session.beginTransaction();
            
            session.save(persona1);
            session.save(persona2);
            
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
