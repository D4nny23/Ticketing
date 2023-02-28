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
 * @author Daniel
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
        String sql = "Select id, estado, fecha_creacion, fecha_cierre, descripcion, prioridad, tipo, id_perfil,id_tecnico, titulo from incidencia";
        try (Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery(sql);) {
            while (rs.next()) {
                i = new Incidencia(rs.getInt("id"), rs.getString("titulo"), rs.getString("estado"), rs.getString("fecha_creacion"),
                        rs.getString("fecha_cierre"), rs.getString("descripcion"), rs.getString("prioridad"), rs.getString("tipo"),
                        rs.getInt("id_perfil"), rs.getInt("id_tecnico"));
                incidencias.add(i);
            }
            return incidencias;
        }
    }

    @Override
    public void insertaPerfil(Perfil p) {
        String sql = "Insert into perfiles(nombre, apellido, tipo, correo,password, telefono) values(?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, p.getNombre());
            stm.setString(2, p.getApellido());
            stm.setString(3, p.getTipo());
            stm.setString(4, p.getCorreo());
            stm.setString(5, p.getPassword());
            stm.setString(6, p.getTelefono());
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

    @Override
    public Incidencia buscaIncidenciaPorId(int id) throws Exception {
        Incidencia i = null;
        String sql = "Select id,titulo, estado, fecha_creacion, fecha_cierre, descripcion, prioridad, tipo, id_perfil,id_tecnico from incidencia where id=" + id;
        try (Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery(sql);) {
            while (rs.next()) {
                i = new Incidencia(rs.getInt("id"), rs.getString("titulo"), rs.getString("estado"), rs.getString("fecha_creacion"),
                        rs.getString("fecha_cierre"), rs.getString("descripcion"), rs.getString("prioridad"), rs.getString("tipo"),
                        rs.getInt("id_perfil"), rs.getInt("id_tecnico"));
            }
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void insertaIncidencia(Incidencia i) throws Exception {
        String sql = "Insert into incidencia( titulo ,estado, descripcion, prioridad, tipo, id_perfil) values(?,?,?,?,?,?)";
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, i.getTitulo());
            stm.setString(2, i.getEstado());
            stm.setString(3, i.getDescripcion());
            stm.setString(4, i.getPrioridad());
            stm.setString(5, i.getTipo());
            stm.setInt(6, i.getId_perfil());
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public ArrayList<Perfil> devuelvePerfiles() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificaPerfil(Perfil p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarPerfil(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificaIncidencia(Incidencia i) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarIncidencia(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
