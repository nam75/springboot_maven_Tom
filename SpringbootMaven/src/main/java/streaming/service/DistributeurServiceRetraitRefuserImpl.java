/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */

public class DistributeurServiceRetraitRefuserImpl implements DistributeurService{
    
   
    @Override
    public boolean retrait(long idCompte, Short code, long montant) {
        return false;
    }
    
}
