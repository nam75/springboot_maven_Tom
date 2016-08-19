/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.FilmDAO;

/**
 *
 * @author admin
 */
@Service
public class FilmService {
   
    @Autowired
    private LoggingService loggingService;
    
    @Autowired
    private FilmDAO filmDAO;
    
    public void save(){
        loggingService.log("FilmService.save");
    }
}
