
package streaming.service;

import org.springframework.stereotype.Repository;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
@Repository
public interface IPaysService {
    public void ajouter(Pays pays);
    
}
