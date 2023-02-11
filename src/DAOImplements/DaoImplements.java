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
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketing", "root", "root");
    }

    @Override
    public ArrayList<Incidencia> devuelveIncidencias() throws Exception {
        ArrayList<Incidencia> incidencias = new ArrayList<>();
        Incidencia i;
        String sql = "Select id, estado, fecha_creacion, fecha_cierre, descripcion, prioridad, tipo, id_perfil,id_tecnico from ticketing";
        try (Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery(sql);) {
            while (rs.next()) {
                i = new Incidencia(rs.getInt("id"), rs.getString("estado"), rs.getString("fecha_creacion"), rs.getString("fecha_cierre"),
                        rs.getString("descripcion"), rs.getString("prioridad"), rs.getString("tipo"), rs.getInt("id_perfil"), rs.getInt("id_tecnico"));
                incidencias.add(i);
            }
            return incidencias;
        }
    }

    @Override
    public void insertaPerfil(Perfil p) {
        String sql = "Insert into perfiles(nombre, apellido, correo,password, telefono) values(?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, p.getNombre());
            stm.setString(2, p.getApellido());
            stm.setString(3, p.getCorreo());
            stm.setString(4, p.getPassword());
            stm.setString(5, p.getTelefono());
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
           
        }

    }

    @Override
    public Perfil buscaPerfil(String correo) throws Exception {
        Perfil p = null;
        String sql = "Select id, nombre, apellido, tipo, correo, password, telefono, intentos from perfiles where correo='" + correo + "'";
        try (Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery(sql);) {
            while (rs.next()) {
                p = new Perfil(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("tipo"),
                        rs.getString("correo"), rs.getString("password"), rs.getString("telefono"), rs.getInt("intentos"));
            }
        } catch (Exception e) {
            throw e;
        }
        return p;
    }

    public void actualizaIntentos(int id, int numero) throws Exception {

        if (numero <= 3) {
            String sql = "Update perfiles set intentos= " + numero + " where id=" + id;

            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.executeUpdate();
            } catch (Exception e) {
            }
        } else {
            String sql = "Update perfiles set intentos= " + 1 + " where id=" + id;

            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.executeUpdate();
            } catch (Exception e) {
            }
        }

    }

    @Override
    public void close() throws Exception {
        con.close();
    }

}
