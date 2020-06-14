/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xpacheco
 */
public class TelefonoDAO implements ITelefonoDAO {

    private List<Telefono> listarTelefono;
    
    public TelefonoDAO() {
        listarTelefono=new ArrayList<Telefono>();
    }
    
    @Override
    public void create(Telefono telefono) {
        
        listarTelefono.add(telefono);
    }

    @Override
    public Telefono read(int codigo) {
        
        Telefono telf = new Telefono();
        return telf;
    }

    @Override
    public void update(Telefono telefono) {
    }

    @Override
    public void delete(int codigo) {
    }

    @Override
    public List<Telefono> ListaTelefonos() {
        
        return listarTelefono;
    }
    
    
}
