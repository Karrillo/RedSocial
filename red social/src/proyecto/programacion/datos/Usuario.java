/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion.datos;

/**
 *
 * @author Carrillo
 */
public class Usuario {
    //nodo donde se guardara datos personales del usuario

    public String usuario;
    public String clave;

    public String nombre;
    public String apellidos;
    public String sexo;
    public String fechaNacimiento;
    public String telefono;
    public String correo;
    public String residencia;
    public String descripcionPersonal;
    public String estudio;
    public String deporte;
    public String actividades;

    public Usuario siguiente;

    public Usuario(String usuario, String clave, String nombre, String apellidos, String sexo, String fechaNacimiento,
            String telefono, String correo, String residencia, String descripcionPersonal, String estudio, String deporte,
            String actividades) {

        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.residencia = residencia;
        this.descripcionPersonal = descripcionPersonal;
        this.estudio = estudio;
        this.deporte = deporte;
        this.actividades = actividades;

    }

}
