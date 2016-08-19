
package streaming.dao;

import java.util.Date;
import streaming.entity.Logging;

public interface LoggingDAO {
    public void ajouter(Logging logging, String msg);
    
}
