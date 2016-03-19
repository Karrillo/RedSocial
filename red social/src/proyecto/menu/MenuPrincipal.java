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
public class MenuPrincipal {

    String opcion;//variable para opcion segun desea el usuario
    ListaEnlazada Ingreso = ProyectoProgramacion.lista;//llama la clase lista enlazada

    public void menuP() {

        do {
            opcion = JOptionPane.showInputDialog(null, "LA RED \n 1) Ingresar \n 2) Registrarse \n 3) Salir");
            switch (Integer.parseInt(opcion)) {
                case 1:
                    iniciar();
                    break;
                case 2:
                    registrarse();
                    break;
                case 3:
                    break;
            }
        } while (Integer.parseInt(opcion) != 3);
    }

    private void registrarse() {

//pide datos para luego guardar al nodo usuario
        String usuario = JOptionPane.showInputDialog(null, "REGISTRO \n Ingrese los datos para ser registrado al sistema  \n Usuario:");
        String clave = JOptionPane.showInputDialog(null, "clave:");
        String nombre = JOptionPane.showInputDialog(null, "Nombre:");
        String apellidos = JOptionPane.showInputDialog(null, "Apellidos:");
        String sexo = JOptionPane.showInputDialog(null, "sexo:");
        String fechaNacimiento = JOptionPane.showInputDialog(null, "Fecha Nacimiento:");
        String telefono = JOptionPane.showInputDialog(null, "Telefono:");
        String correo = JOptionPane.showInputDialog(null, "Correo:");
        String residencia = JOptionPane.showInputDialog(null, "Recidencia:");
//Guarda los datos en el nodo
        Ingreso.insertaNodo(usuario, clave, nombre, apellidos, sexo, fechaNacimiento, telefono, correo, residencia,
                "", "", "", "");

        JOptionPane.showMessageDialog(null, "Felicidades estas registrado", "Informativo", JOptionPane.INFORMATION_MESSAGE);
        menuP();
    }

    private void iniciar() {
//verifica si hay un nodo usuario segun lo ingresado para iniciar
        MenuInterno instancia = new MenuInterno();
//pide datos para comprar con los nodos usuarios ya existentes
        String usuario = JOptionPane.showInputDialog(null, "Usuario: ");
        String clave = JOptionPane.showInputDialog(null, "Clave: ");
//compara datos y si son correctos va a la clase menuInterno
        if (Ingreso.verificarUsuario(usuario, clave) == true) {
            instancia.perfil(usuario);
            instancia.menuI();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o Clave incorrecta", "Informativo", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
