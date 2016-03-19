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
public class Notificacion {
//nodo para notificar sobre una invitacion de amigo
    
    public String usuario;
    public String amigo;
    public boolean confima = true;
    
    public Notificacion siguiente;

    public Notificacion(String usuario, String amigo, boolean confima) {

        this.usuario = usuario;
        this.amigo = amigo;
        this.confima = confima;

    }

}
