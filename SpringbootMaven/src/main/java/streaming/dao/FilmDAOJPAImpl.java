
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import streaming.entity.Film;
import static streaming.entity.Serie_.titre;

@Repository
public class FilmDAOJPAImpl  implements IFilmDAO{

    @Override
    public void ajouter(Film film) {
        EntityManager em = Persistence.createEntityManagerFactory("streaming_PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(film);
        em.getTransaction().commit();
    }
    
    
}
