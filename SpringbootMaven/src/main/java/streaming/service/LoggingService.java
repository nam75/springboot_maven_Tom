/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Date;
import org.springframework.stereotype.Service;
import streaming.entity.Logging;

/**
 *
 * @author admin
 */


public interface LoggingService {
    
    
    public void log(String msg);
    public void ajouter(String msg);

        
}
