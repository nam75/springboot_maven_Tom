/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.service.DistributeurService;
import streaming.service.LoggingService;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class DistributeurLoggingTest {
    
    @Autowired
    private LoggingService loggingService;
    //@Autowired 
    //private DistributeurService distributeurService;
    
    
    @Test
    public void log() {
        loggingService.ajouter(" King of",);
    }
    /*
    @Test
    public void testRetrait() {
        Assert.assertTrue(distributeurService.retrait((long)1, (short)1234,100));
    }
   */
}
