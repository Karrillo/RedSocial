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
public class MenuComentarios {

    String opcion;//variable que guarda la opcion del menu
    ListaEnlazada Ingreso = ProyectoProgramacion.lista;//llama la clase lista enlazada

    public void menuC(String nombreUsuario) {

        do {

            opcion = JOptionPane.showInputDialog(null, "BIENVENIDO  \n 1)Ingresar comentarios \n 2)Ver comentarios \n 3)Volver ");
            switch (Integer.parseInt(opcion)) {
                case 1:
                    //ingresa comentarios en perfil
                    String nota = JOptionPane.showInputDialog(null, "Comentario: \n");
                    Ingreso.Comentario(nombreUsuario, nota);
                    break;
                case 2:
                    //ver comentarios en perfil
                    Ingreso.imprimirComentario(nombreUsuario);
                    break;
                case 3:

                    break;
            }
            //si es 3 se devuelve al menu anterior 
        } while (Integer.parseInt(opcion) != 3);

    }

}
