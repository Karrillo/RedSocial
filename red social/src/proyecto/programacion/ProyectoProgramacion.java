/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion;

import proyecto.programacion.Lista.ListaEnlazada;
/**
 *
 * @author Jose Carrillo Mendez
 * 2015/10/17
 * 2015/11/10
 */
import proyecto.menu.MenuPrincipal;

public class ProyectoProgramacion {

    public static ListaEnlazada lista = new ListaEnlazada();//crea un nodo para usuarios

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//llama al metodo para una lista de usuarios predeterminada 
        lista.listaUsuarios();
//llama la clase del menu principal para iniciar el programa
        MenuPrincipal Principal = new MenuPrincipal();
        Principal.menuP();
    }

}
