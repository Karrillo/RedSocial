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
public class MenuContactos {

    ListaEnlazada Ingreso = ProyectoProgramacion.lista;//llama la clase lista enlazada
    String opcion;//variable que guarda la opcion del menu
    String Buscar;//variable que guarda un String para comprar y buscar sobre la lista

    public void MenuC(String nombreUsuario) {
        
        //buscar el String ingresado para comparar si lo encuentra le tira un mensaje si quiere enviar solicitud 
        do {
            opcion = JOptionPane.showInputDialog(null, "BUSCAR:  \n 1)Nombre \n 2)Apellidos "
                    + "\n 3)Fecha de Nacimiento \n 4)Correo \n 5)Residencia \n 6)Salir");
            switch (Integer.parseInt(opcion)) {

                case 1:
                    Buscar = JOptionPane.showInputDialog(null, "Nombre:");
                    if (Ingreso.bAmigos(Buscar, Integer.parseInt(opcion)) == true) {
                        if (JOptionPane.showConfirmDialog(null, "Enviar solicitud", "Informarmativo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            Ingreso.Notificacion(Buscar, nombreUsuario, true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro a nadie con esas caracteristicas", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 2:
                    Buscar = JOptionPane.showInputDialog(null, "Apellidos:");
                    if (Ingreso.bAmigos(Buscar, Integer.parseInt(opcion)) == true) {
                        if (JOptionPane.showConfirmDialog(null, "Enviar solicitud", "Informarmativo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            Ingreso.Notificacion(Buscar, nombreUsuario, true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro a nadie con esas caracteristicas", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 3:
                    Buscar = JOptionPane.showInputDialog(null, "Fecha de Nacimiento:");
                    if (Ingreso.bAmigos(Buscar, Integer.parseInt(opcion)) == true) {
                        if (JOptionPane.showConfirmDialog(null, "Enviar solicitud", "Informarmativo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            Ingreso.Notificacion(Buscar, nombreUsuario, true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro a nadie con esas caracteristicas", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    Buscar = JOptionPane.showInputDialog(null, "Correo:");
                    if (Ingreso.bAmigos(Buscar, Integer.parseInt(opcion)) == true) {
                        if (JOptionPane.showConfirmDialog(null, "Enviar solicitud", "Informarmativo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            Ingreso.Notificacion(Buscar, nombreUsuario, true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro a nadie con esas caracteristicas", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
                    Buscar = JOptionPane.showInputDialog(null, "Residencia:");
                    if (Ingreso.bAmigos(Buscar, Integer.parseInt(opcion)) == true) {
                        if (JOptionPane.showConfirmDialog(null, "Enviar solicitud", "Informarmativo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            Ingreso.Notificacion(Buscar, nombreUsuario, true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro a nadie con esas caracteristicas", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 6:
                    break;
            }
        } while (Integer.parseInt(opcion) != 6);

    }

}
