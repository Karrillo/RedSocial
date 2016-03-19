/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.menu;

import javax.swing.JOptionPane;
import proyecto.programacion.Lista.ListaEnlazada;
import proyecto.programacion.ProyectoProgramacion;
import proyecto.menu.MenuInterno;

/**
 *
 * @author Carrillo
 */
public class MenuModificar {

    ListaEnlazada Ingreso = ProyectoProgramacion.lista;//llama la clase lista enlazada

    public String menuM(String nombreUsuario) {

        String Cambio = "";//variable String donde guarda el cambio deseado
        String opcion, Cambio_segundo;//variable para opciones segun el cambio del nodo realizar

        do {
            opcion = JOptionPane.showInputDialog(null, "MODIFICAR  \n 1)Usuario \n 2)Clave "
                    + "\n 3)Nombre \n 4)Apellidos \n 5)Sexo \n 6)Fecha de Nacimiento \n 7)Telefono \n 8)Correo \n 9)Residencia \n 10)Descripcion "
                    + "\n 11)Estudio \n 12)Deporte \n 13)Actividades \n 14)Salir");

            switch (Integer.parseInt(opcion)) {
                case 1:
                    Cambio = JOptionPane.showInputDialog(null, "Ingrese el nuevo usuario: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio, Integer.parseInt(opcion));
                    break;
                case 2:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese la nueva clave: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 3:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 4:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese los nuevos apellidos: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 5:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese el nuevo sexo: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 6:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese la nueva fecha de nacimiento: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 7:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 8:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 9:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese el nuevo residencial: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 10:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese la nueva descripcion: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 11:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese el nuevo estudio: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 12:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese el nuevo deporte: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 13:
                    Cambio_segundo = JOptionPane.showInputDialog(null, "Ingrese sus nuevas actividades: ");
                    Ingreso.modificarUsuario(nombreUsuario, Cambio_segundo, Integer.parseInt(opcion));
                    break;
                case 14:
                    break;
            }
        } while (Integer.parseInt(opcion) != 14);
        return Cambio;
    }

}
