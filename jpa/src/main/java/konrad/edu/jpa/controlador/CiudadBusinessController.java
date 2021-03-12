/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.edu.jpa.controlador;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import konrad.edu.jpa.dao.CiudadJpaController;
import konrad.edu.jpa.dao.exceptions.NonexistentEntityException;
import konrad.edu.jpa.modelo.Ciudad;

/**
 *
 * @author LENOVO
 */
public class CiudadBusinessController {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("konrad.edu.jpa_jpa_jar_1.0-SNAPSHOTPU"); 
    private CiudadJpaController ciudadDAO = new CiudadJpaController(emf);
    
    public void createCiudad(Ciudad ciudadACrear){
        try {
            ciudadDAO.create(ciudadACrear);
        } catch (Exception ex) {
            Logger.getLogger(CiudadBusinessController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Ciudad> readCiudadAll(){
        return ciudadDAO.findCiudadEntities();
    }

    public void updateCiudad(Ciudad ciudadAActualizar){
        try {
            ciudadDAO.edit(ciudadAActualizar);
        } catch (Exception ex) {
            Logger.getLogger(CiudadBusinessController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteCiudad(Ciudad ciudadAEliminar){
        try {
            ciudadDAO.destroy(ciudadAEliminar.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CiudadBusinessController.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex) {
            Logger.getLogger(CiudadBusinessController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
//