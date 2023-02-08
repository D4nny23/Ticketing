/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplements;

import DAOInterface.DAOInterface;
import Pojo.Incidencia;
import Pojo.Perfil;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author dev
 */
public class DaoImplements implements AutoCloseable, DAOInterface {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("No se ha podido cargar el driver");
            System.exit(1);
        }
    }
    Connection con = null;

    public DaoImplements() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ticketing", "root", "root");
    }

    @Override
    public ArrayList<Incidencia> devuelveIncidencias() throws Exception {
        ArrayList<Incidencia> incidencias = new ArrayList<>();
        Incidencia i;
        String sql = "Select id, estado, fecha_creacion, fecha_cierre, descripcion, prioridad, tipo, id_perfil,id_tecnico from Ticketing";
        try (Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);) {
            while (rs.next()) {
                i = new Incidencia(rs.getInt("id"), rs.getString("estado"), rs.getString("fecha_creacion"), rs.getString("fecha_cierre"),
                        rs.getString("descripcion"), rs.getString("prioridad"), rs.getString("tipo"), rs.getInt("id_perfil"), rs.getInt("id_tecnico"));
                incidencias.add(i);
            }
            return incidencias;
        }
    }

    @Override
    public String insertaPerfil(Perfil p) throws Exception {
        String sql = "Insert into Perfil values(?,?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, p.getId());
            stm.setString(2, p.getNombre());
            stm.setString(3, p.getApellido());
            stm.setString(4, p.getTipo());
            stm.setString(5, p.getCorreo());
            stm.setString(6, p.getPassword());
            stm.setString(7, p.getTelefono()); 
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al registrarse";
        }
        return "Hola";
        
    }

    @Override
    public void close() throws Exception {
        con.close();
    }

}
