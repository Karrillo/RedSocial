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

public class Amigos {
//nodo donde guardara los datos de quien es su amigo
    
    public String usuario;
    public String amigo;
    
    public Amigos siguiente;

    public Amigos(String usuario, String amigo) {

        this.usuario = usuario;
        this.amigo = amigo;

    }
}
