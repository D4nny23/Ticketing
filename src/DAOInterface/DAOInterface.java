/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Pojo.Incidencia;
import Pojo.Perfil;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public interface DAOInterface {

    public ArrayList<Incidencia> devuelveIncidencias() throws Exception;

    public void insertaPerfil(Perfil p) throws Exception;

    public Perfil buscaPerfil(String correo) throws Exception;

    public void actualizaIntentos(int id, int numero) throws Exception;

    public Incidencia buscaIncidenciaPorId(int id) throws Exception;

    public void insertaIncidencia(Incidencia i) throws Exception;
    
    //NUEVO

    public ArrayList<Perfil> devuelvePerfiles() throws Exception;

    public void modificaPerfil(Perfil p) throws Exception;

    public void borrarPerfil(int id) throws Exception;
    
    public void modificaIncidencia(Incidencia i) throws Exception;

    public void borrarIncidencia(int id) throws Exception;
    
}
