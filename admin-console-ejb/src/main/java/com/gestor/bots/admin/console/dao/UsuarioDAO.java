/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestor.bots.admin.console.dao;

import com.gestor.bots.admin.console.model.Usuario;
import com.persist.common.dao.DefaultGenericDAOImple;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Gestor
 */
@LocalBean
@Stateless
public class UsuarioDAO extends DefaultGenericDAOImple<Usuario, String>{
    public UsuarioDAO(){
    super(Usuario.class);
}
}
