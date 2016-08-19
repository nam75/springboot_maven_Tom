
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.FilmDAOJPAImpl;
import streaming.dao.IFilmDAO;
import streaming.entity.Film;
@Service
public class FilmServiceImpl implements IFilmService{
    
    @Autowired
    private IFilmDAO filmDAO;
    
    public  void ajouter(Film film){
       
        filmDAO.ajouter(film);
    }
    
    
}
