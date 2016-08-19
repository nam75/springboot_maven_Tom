/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.IPaysDAO;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
@Service
public class PaysServiceImpl implements IPaysService{
@Autowired
private IPaysDAO paysDAO;
    
    @Override
    public void ajouter(Pays pays) {
        paysDAO.ajouterPays(pays);
        
    }
    
}
