/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import streaming.entity.Pays;

@Repository
public class PaysDAOJPAImpl implements IPaysDAO{
     
    public void ajouterPays(Pays pays){
         EntityManager em = Persistence.createEntityManagerFactory("streaming_PU").createEntityManager();
         em.getTransaction().begin();
         em.persist(pays);
         em.getTransaction().commit();
         
     }
    
}
