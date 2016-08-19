
package streaming.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Pays;
import streaming.service.IPaysService;
import streaming.spring.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class PaysTest {
    @Autowired
    private IPaysService paysService;
    @Test
     public void testAjouterPays() {
        Pays pays = new Pays();
        pays.setNom("La Centrafrique");
        paysService.ajouter(pays);
        
     }
    
   
}
