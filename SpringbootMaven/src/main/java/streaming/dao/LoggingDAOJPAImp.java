/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import streaming.entity.Logging;

/**
 *
 * @author admin
 */
@Repository
public class LoggingDAOJPAImp implements LoggingDAO{

     public void ajouter(Logging logging, String msg, Date dateLogging) {
        logging.setMsg(msg);
        logging.setDatelogging(dateLogging);
        EntityManager em = Persistence.createEntityManagerFactory("streaming_PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(logging);
        em.getTransaction().commit();
    }

   

    
    

    
}
