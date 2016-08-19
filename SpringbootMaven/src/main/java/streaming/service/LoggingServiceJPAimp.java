
package streaming.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.LoggingDAO;
import streaming.entity.Logging;
import static streaming.entity.Logging_.dateLogging;

@Service
public class LoggingServiceJPAimp implements LoggingService{
    @Autowired
    private LoggingDAO loggingDAO;

    @Override
    public void log(String msg) {
        
    }

    public void ajouter(String msg) {
        Logging logging = new Logging();
        logging.setDatelogging(new Date());
        loggingDAO.ajouter(logging, msg);
    }

    
    
    
    
}
