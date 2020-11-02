import dev.lgmarcos.practicacrudhibernate.dao.PersonaDAO;

/**
 *
 * @author lgmar
 */
public class App {
    public static void main(String[] args) {
        new App().start();
    }
    
    public void start(){
        PersonaDAO daoPersona = new PersonaDAO();
        daoPersona.consultarEmpleados();
    }
        
    
}

