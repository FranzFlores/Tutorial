/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import java.util.List;

/**
 *
 * @author franzandresflores
 */
public interface InterfazDAO <T>{
    public void guardar(T obj) throws Exception;
    public List<T> listar();
    public T obtener(Long id);
    public Long gererarID();
}
