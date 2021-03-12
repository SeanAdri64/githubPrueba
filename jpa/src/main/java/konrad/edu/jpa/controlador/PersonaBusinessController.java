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
import konrad.edu.jpa.dao.PersonaJpaController;
import konrad.edu.jpa.dao.exceptions.NonexistentEntityException;
import konrad.edu.jpa.modelo.Persona;
/**
 *
 * @author ADRIAN
 */
public class PersonaBusinessController {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("konrad.edu.jpa_jpa_jar_1.0-SNAPSHOTPU"); 
    private PersonaJpaController PersonaDAO = new PersonaJpaController(emf);
    public void createPersona(Persona ciudadACrear){
        try {
            PersonaDAO.create(ciudadACrear);
        } catch (Exception ex) {
            Logger.getLogger(PersonaBusinessController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Persona> readCiudadAll(){
        return PersonaDAO.findPersonaEntities();
    }

    public void updatePersona(Persona PersonaAActualizar){
        try {
            PersonaDAO.edit(PersonaAActualizar);
        } catch (Exception ex) {
            Logger.getLogger(PersonaBusinessController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePersona(Persona PersonaAEliminar){
        try {
            PersonaDAO.destroy(PersonaAEliminar.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersonaBusinessController.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex) {
            Logger.getLogger(PersonaBusinessController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//