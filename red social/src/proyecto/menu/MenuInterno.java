/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.menu;

import javax.swing.JOptionPane;
import proyecto.programacion.Lista.ListaEnlazada;
import proyecto.programacion.ProyectoProgramacion;

/**
 *
 * @author Carrillo
 */
public class MenuInterno {

    public String nombreUsuario;//variable para crear un contructor y guardar el usuario del perfil ingresado
    String opcion, cambioUsuario;
    ListaEnlazada Ingreso = ProyectoProgramacion.lista;//llama la clase lista enlazada que crea en la clase principal

//llama otros menus 
    MenuModificar modi = new MenuModificar();
    MenuComentarios comen = new MenuComentarios();
    MenuContactos conta = new MenuContactos();

    public void perfil(String usu) {
        //contructor que guarda el usuario del perfil guardado para tomar en referencia todos los metodos dentro del sistema
        this.nombreUsuario = usu;
    }

    public void menuI() {

        //muestra menu y segun opcion escogina entra a otros menus o realiza metodos de la clase listas enlaza
        do {
            opcion = JOptionPane.showInputDialog(null, "BIENVENIDO  \n 1)Mis datos Personales \n 2)Cambiar mis Datos "
                    + "\n 3)Mis Comentarios \n 4)Buscar Contactos \n 5)Mis amigos \n 6)Notificacion \n 7)Comentarios de Amigos \n 8)Cerrar sesion");
            switch (Integer.parseInt(opcion)) {
                case 1:
                    //imprimir datos personales del perfil
                    Ingreso.imprimirPerfil(nombreUsuario);
                    break;
                case 2:
                    //guardar y mantener por cambios el usuario ingresado
                    cambioUsuario = modi.menuM(nombreUsuario);
                    if (cambioUsuario != "") {
                        nombreUsuario = cambioUsuario;
                    }
                    break;
                case 3:
                    comen.menuC(nombreUsuario);
                    break;
                case 4:
                    conta.MenuC(nombreUsuario);
                    break;
                case 5:
                    Ingreso.imprimirAmigos(nombreUsuario);
                    break;
                case 6:
                    Ingreso.Solicitud(nombreUsuario);
                    break;
                case 7:
                    String amigo = JOptionPane.showInputDialog(null, "De cual amigo desea ver sus comentarios: ");
                    Ingreso.imprimirComAmigos(amigo);
                    break;
                case 8:
                    break;
            }
        } while (Integer.parseInt(opcion) != 8);

    }

}
