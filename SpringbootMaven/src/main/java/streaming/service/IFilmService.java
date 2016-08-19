
package streaming.service;

import org.springframework.stereotype.Repository;
import streaming.entity.Film;

@Repository
public interface IFilmService {
    public void ajouter(Film film);
    
}

        
    