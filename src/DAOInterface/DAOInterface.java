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
 * @author dev
 */
public interface DAOInterface {
    public ArrayList<Incidencia> devuelveIncidencias() throws Exception;
    public String insertaPerfil(Perfil p) throws Exception;
}
