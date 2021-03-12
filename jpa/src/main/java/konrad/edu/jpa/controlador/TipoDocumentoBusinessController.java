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
import konrad.edu.jpa.dao.TipoDocumentoJpaController;
import konrad.edu.jpa.dao.exceptions.NonexistentEntityException;
import konrad.edu.jpa.modelo.TipoDocumento;
/**
 *
 * @author ADRIAN
 */
public class TipoDocumentoBusinessController {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("konrad.edu.jpa_jpa_jar_1.0-SNAPSHOTPU"); 
    private TipoDocumentoJpaController ciudadDAO = new TipoDocumentoJpaController(emf);


/**
 *
 * @author stive
 */
public class TipoDocumentoController {
    
        
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("konrad.edu.jpa_jpa_jar_1.0-SNAPSHOTPU"); 
    private TipoDocumentoJpaController tipoDocumentoDAO = new TipoDocumentoJpaController(emf);
    
     public void createTipoDocumento(TipoDocumento crearTipoDocumento){
        try {
            tipoDocumentoDAO.create(crearTipoDocumento);
            
        } catch (Exception ex) {
            Logger.getLogger(TipoDocumentoJpaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<TipoDocumento> readTipoDocumento(){
        return tipoDocumentoDAO.findTipoDocumentoEntities();
        
    }

 

    public void updateTipoDocumento(TipoDocumento actualizarTipoDocumento){
        try {
            tipoDocumentoDAO.edit(actualizarTipoDocumento);
            
        } catch (Exception ex) {
            Logger.getLogger(TipoDocumentoJpaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 

public void deleteTipoDocumento(TipoDocumento eliminarTipoDocumento){
        try {
            tipoDocumentoDAO.destroy(eliminarTipoDocumento.getId());
           
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(TipoDocumentoJpaController.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}}