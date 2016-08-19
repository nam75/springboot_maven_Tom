/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import streaming.service.LoggingService;

/**
 *
 * @author admin
 */
@Repository
public class FilmDAO {
    @Autowired
    private LoggingService loggingService;
    
    public void save(){
        loggingService.log("FilmDAO.save");
    }
    
}
