/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketing;

import Pojo.Incidencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dev
 */
public class Prueba {

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("No se ha podido cargar el driver");
            System.exit(1);
        }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketing", "root", "root");

        String sql = "Select id,titulo, estado, fecha_creacion, fecha_cierre, descripcion, prioridad, tipo, id_perfil,id_tecnico from incidencia where id=" + 1;
        try (Statement stm = con.createStatement(); ResultSet rs = stm.executeQuery(sql);) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("titulo") + " " + rs.getString("estado") + " " + rs.getString("fecha_creacion") + " "
                        + rs.getString("fecha_cierre") + " " + rs.getString("descripcion") + " " + rs.getString("prioridad") + " " + rs.getString("tipo") + " "
                        + rs.getInt("id_perfil") + " " + rs.getInt("id_tecnico"));
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
