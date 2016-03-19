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
public class Comentario {
//nodo donde guardara los comentarios del usuario
    
    public String usuario;
    public String mensaje;
   
    public Comentario siguiente;

    public Comentario(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

}
