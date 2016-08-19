/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Film;
import streaming.service.FilmServiceImpl;
import streaming.service.IFilmService;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class FilmTest {
    
  @Autowired
  private IFilmService filmService;
  @Test
    public void testAjouterFilm() {
        Film film = new Film();
        film.setTitre("Oscar au pays des Blondes");
        filmService.ajouter(film);
    }
}