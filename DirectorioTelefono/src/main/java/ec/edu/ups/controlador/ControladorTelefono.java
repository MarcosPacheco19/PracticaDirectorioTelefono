/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.List;

/**
 *
 * @author xpacheco
 */
public class ControladorTelefono {
    
    
    private TelefonoDAO telefonoDAO;
    private Telefono telefono;
    
    
    //Constructores
    public ControladorTelefono() {
        
    }
    
     public ControladorTelefono(TelefonoDAO telefonoDao) {
        this.telefonoDAO=telefonoDao;
    }
     
     
    //metodo crearTelefono
    public void crearTelefono(Telefono telf) {
        telefono = telf;
        telefonoDAO.create(telefono);
    }
    
    
    //metodo verTelefonos
    public List<Telefono> verTelefonos() {
        
        return telefonoDAO.ListaTelefonos();
    }
}
