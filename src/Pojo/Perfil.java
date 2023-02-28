/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author dev
 */
public class Perfil {

    private int id;
    private String nombre;
    private String apellido;
    private String tipo;
    private String correo;
    private String password;
    private String telefono;
    private int intentos;

    public Perfil(int id, String nombre, String apellido, String tipo, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Perfil(String nombre, String apellido, String tipo, String correo, String password, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
    }

    public Perfil(int id, String nombre, String apellido, String tipo, String correo, String password, String telefono, int intentos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.intentos = intentos;
    }

    public Perfil(String nombre, String apellido, String tipo, String correo, String password, String telefono, int intentos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.intentos = intentos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}
