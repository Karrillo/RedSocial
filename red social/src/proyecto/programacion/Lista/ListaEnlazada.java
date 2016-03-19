/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion.Lista;

import javax.swing.JOptionPane;
import proyecto.programacion.datos.Usuario;
import proyecto.programacion.datos.Comentario;
import proyecto.programacion.datos.Notificacion;
import proyecto.programacion.datos.Amigos;

/**
 *
 * @author Carrillo
 */
public class ListaEnlazada {

    public Usuario primero;
    public Comentario primeroC;
    public Notificacion primeroN;
    public Amigos primeroA;
    //public Empleado anterior;
    public Usuario fin;

    //verifica si la lista esta vacia de usuarios
    public boolean usuVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

//verifica si la lista esta vacia de notoficaciones
    public boolean notiVacia() {
        if (primeroN == null) {
            return true;
        } else {
            return false;
        }
    }

//verifica si la lista esta vacia de comentarios
    public boolean comeVacia() {
        if (primeroC == null) {
            return true;
        } else {
            return false;
        }
    }

//verifica si la lista esta vacia de amigos
    public boolean amiVacia() {
        if (primeroA == null) {
            return true;
        } else {
            return false;
        }
    }

    //Crea un nuevo nodo de usuario
    public void insertaNodo(String usuario, String clave, String nombre, String apellidos, String sexo, String fechaNacimiento,
            String telefono, String correo, String residencia, String descripcionPersonal, String estudio, String deporte,
            String actividades) {
        Usuario nuevoNodo = new Usuario(usuario, clave, nombre, apellidos, sexo, fechaNacimiento, telefono, correo, residencia,
                descripcionPersonal, estudio, deporte, actividades);

        if (usuVacia()) {
            primero = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        }
    }

    //busca usuario y clave para ingresar a la red
    public boolean verificarUsuario(String bUsuario, String bClave) {

        Usuario temp = primero;
//recorre todo los nodos existentes
        while (temp != null) {
            //compara usuario y clave del nodo usuario  
            if (bUsuario.equals(temp.usuario) && bClave.equals(temp.clave)) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    //imprimir informacion del usuario personal
    public void imprimirPerfil(String bUsuario) {

        Usuario temp = primero;
        //recorre todo los nodos existentes
        while (temp != null) {
            //buscar segun su usuario el nodo en usuario para imprimir datos
            if (bUsuario.equals(temp.usuario)) {
                JOptionPane.showMessageDialog(null, "Usuario: " + temp.usuario + "\n Clave: " + temp.clave + "\n Nombre : " + temp.nombre + "\n Apellidos : " + temp.apellidos
                        + "\n Sexo: " + temp.sexo + "\n Fecha de Nacimiento : " + temp.fechaNacimiento + "\n Telefono : " + temp.telefono + "\n Correo : " + temp.correo
                        + "\n Residencia : " + temp.residencia + "\n Descripcion : " + temp.descripcionPersonal + "\n Estudio : " + temp.estudio
                        + "\n Deporte : " + temp.deporte + "\n Actividades : " + temp.actividades, "PERFIL", JOptionPane.INFORMATION_MESSAGE);
            }
            temp = temp.siguiente;
        }

    }

    //modificar informacion personal
    public void modificarUsuario(String bUsuario, String cambio, int opc) {

        Usuario temp = primero;
//recorre todo los nodos existentes
        while (temp != null) {
            //remplaza segun lo ingresado en el nodo usuario
            if (bUsuario.equals(temp.usuario)) {
                if (opc == 1) {
                    temp.usuario = cambio;
                } else if (opc == 2) {
                    temp.clave = cambio;
                } else if (opc == 3) {
                    temp.nombre = cambio;
                } else if (opc == 4) {
                    temp.apellidos = cambio;
                } else if (opc == 5) {
                    temp.sexo = cambio;
                } else if (opc == 6) {
                    temp.fechaNacimiento = cambio;
                } else if (opc == 7) {
                    temp.telefono = cambio;
                } else if (opc == 8) {
                    temp.correo = cambio;
                } else if (opc == 9) {
                    temp.residencia = cambio;
                } else if (opc == 10) {
                    temp.descripcionPersonal = cambio;
                } else if (opc == 11) {
                    temp.estudio = cambio;
                } else if (opc == 12) {
                    temp.deporte = cambio;
                } else if (opc == 13) {
                    temp.actividades = cambio;
                }
            }
            temp = temp.siguiente;
        }

    }

    //crea un nuevo nodo para notificacion de amistad
    public void Notificacion(String usuario, String amigo, boolean confirma) {
        Notificacion nuevoNodo = new Notificacion(usuario, amigo, confirma);

        if (notiVacia()) {
            primeroN = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primeroN;
            primeroN = nuevoNodo;
        }

    }

    //crea un nuevo nodo para amistades
    public void Contactos(String usuario, String amigo) {
        Amigos nuevoNodo = new Amigos(usuario, amigo);

        if (amiVacia()) {
            primeroA = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primeroA;
            primeroA = nuevoNodo;
        }
    }

    //crea nuevo nodo para comentarios 
    public void Comentario(String bUsuario, String mensaje) {

        Comentario nuevoNodo = new Comentario(bUsuario, mensaje);

        if (comeVacia()) {
            primeroC = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primeroC;
            primeroC = nuevoNodo;
        }

    }

    //muestra notificacion de envio de amistades
    public void Solicitud(String usuario) {

        Notificacion temp = primeroN;
        Usuario temp2 = primero;
        //recorre todo los nodos existentes de notificacion
        while (temp != null) {
            //si confirmo un si en amistad crea un nodo de amigos y envia una notificacion al contacto
            if (temp.confima == true && temp.usuario.equals(usuario)) {
                //recorre todo los nodos existentes de usuarios
                while (temp2 != null) {
                    //compara el nodo de la variable amigo para buscar un nodo especifico de usuario
                    if (temp.amigo.equals(temp2.usuario)) {
                        if (JOptionPane.showConfirmDialog(null, "Desea aceptar amistad de:\n Nombre:" + temp2.nombre + "\n Apellidos : " + temp2.apellidos + "\n Sexo: " + temp2.sexo + "\n Fecha de Nacimiento : "
                                + temp2.fechaNacimiento + "\n Telefono : " + temp2.telefono + "\n Correo : " + temp2.correo
                                + "\n Residencia : " + temp2.residencia + "\n Descripcion : " + temp2.descripcionPersonal + "\n Estudio : " + temp2.estudio
                                + "\n Deporte : " + temp2.deporte + "\n Actividades : " + temp2.actividades, "Solicitud", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            Contactos(temp.usuario, temp.amigo);
                            Contactos(temp.amigo, temp.usuario);
                            temp.confima = false;
                        }
                    }
                    temp2 = temp2.siguiente;
                }
            }
            temp = temp.siguiente;
        }

    }

    //imprimir comentarios 
    public void imprimirComentario(String bUsuario) {
        int cont = 0;
        Comentario temp = primeroC;
        //recorre todo los nodos existentes
        while (temp != null) {
            //segun el usuario buscar los ultimos 10 comentarios o mensajes escritos
            if (bUsuario.equals(temp.usuario) && cont < 10) {
                JOptionPane.showMessageDialog(null, "Comentario : \n" + temp.mensaje, "Usuario: " + temp.usuario, JOptionPane.INFORMATION_MESSAGE);
                cont = cont + 1;
            }
            temp = temp.siguiente;
        }

    }

    //buscar contactos 
    public boolean bAmigos(String buscar, int opc) {

        Usuario temp = primero;
//recorre todo los nodos existentes
        while (temp != null) {
//segun el dato ingresado recorre y remplaza el dato 
            if (opc == 1) {
                if (buscar.equals(temp.nombre)) {
                    JOptionPane.showMessageDialog(null, "Nombre : " + temp.nombre + "\n Apellidos : " + temp.apellidos
                            + "\n Sexo: " + temp.sexo + "\n Fecha de Nacimiento : " + temp.fechaNacimiento + "\n Telefono : " + temp.telefono + "\n Correo : " + temp.correo
                            + "\n Residencia : " + temp.residencia, "Contactos: ", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    temp = temp.siguiente;
                }

            } else if (opc == 2) {
                if (buscar.equals(temp.apellidos)) {
                    JOptionPane.showMessageDialog(null, "Nombre : " + temp.nombre + "\n Apellidos : " + temp.apellidos
                            + "\n Sexo: " + temp.sexo + "\n Fecha de Nacimiento : " + temp.fechaNacimiento + "\n Telefono : " + temp.telefono + "\n Correo : " + temp.correo
                            + "\n Residencia : " + temp.residencia, "Contactos: ", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    temp = temp.siguiente;
                }
            } else if (opc == 3) {
                if (buscar.equals(temp.fechaNacimiento)) {
                    JOptionPane.showMessageDialog(null, "Nombre : " + temp.nombre + "\n Apellidos : " + temp.apellidos
                            + "\n Sexo: " + temp.sexo + "\n Fecha de Nacimiento : " + temp.fechaNacimiento + "\n Telefono : " + temp.telefono + "\n Correo : " + temp.correo
                            + "\n Residencia : " + temp.residencia, "Contactos: ", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    temp = temp.siguiente;
                }
            } else if (opc == 4) {
                if (buscar.equals(temp.correo)) {
                    JOptionPane.showMessageDialog(null, "Nombre : " + temp.nombre + "\n Apellidos : " + temp.apellidos
                            + "\n Sexo: " + temp.sexo + "\n Fecha de Nacimiento : " + temp.fechaNacimiento + "\n Telefono : " + temp.telefono + "\n Correo : " + temp.correo
                            + "\n Residencia : " + temp.residencia, "Contactos: ", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                }
            } else if (opc == 5) {
                if (buscar.equals(temp.residencia)) {
                    JOptionPane.showMessageDialog(null, "Nombre : " + temp.nombre + "\n Apellidos : " + temp.apellidos
                            + "\n Sexo: " + temp.sexo + "\n Fecha de Nacimiento : " + temp.fechaNacimiento + "\n Telefono : " + temp.telefono + "\n Correo : " + temp.correo
                            + "\n Residencia : " + temp.residencia, "Contactos: ", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    temp = temp.siguiente;
                }
            }
        }
        return false;
    }

    //imprimir informacion del usuario personal
    public void imprimirAmigos(String bUsuario) {

        Amigos temp = primeroA;
        Usuario temp2 = primero;
        //recorre todo los nodos existentes de Amigos
        while (temp != null) {
            if (bUsuario.equals(temp.usuario)) {
                while (temp2 != null) {
                    //compara el nodo de la variable amigo para buscar un nodo especifico de usuario
                    if (temp.amigo.equals(temp2.usuario)) {
                        JOptionPane.showMessageDialog(null, "Nombre : " + temp2.nombre + "\n Apellidos : " + temp2.apellidos
                                + "\n Sexo: " + temp2.sexo + "\n Fecha de Nacimiento : " + temp2.fechaNacimiento + "\n Telefono : " + temp2.telefono + "\n Correo : " + temp2.correo
                                + "\n Residencia : " + temp2.residencia + "\n Descripcion : " + temp2.descripcionPersonal + "\n Estudio : " + temp2.estudio
                                + "\n Deporte : " + temp2.deporte + "\n Actividades : " + temp2.actividades, "Mis Amigos:", JOptionPane.INFORMATION_MESSAGE);
                    }
                    temp2 = temp2.siguiente;
                }
            }
            temp = temp.siguiente;
        }

    }

    //muestra los comentarios de los amigos 
    public void imprimirComAmigos(String bUsuario) {

        Usuario temp = primero;
        Amigos temp2 = primeroA;
        Comentario temp3 = primeroC;

        int cont = 0;//variable que sirve como contador para que no imprima mas de 10 comentarios de su amigo
        //recorre todo los nodos existentes de Amigos y verifica si esta ese amigo
        while (temp != null) {
            if (bUsuario.equals(temp.nombre)) {

                while (temp2 != null) {

                    if (temp.usuario.equals(temp2.usuario)) {
                        while (temp3 != null) {
                            //recorre el nodo de comentarios para imprimirlos
                            if (temp2.usuario.equals(temp3.usuario) && cont < 10) {
                                JOptionPane.showMessageDialog(null, "Comentario : \n" + temp3.mensaje, "Usuario: " + temp.nombre + " " + temp.apellidos, JOptionPane.INFORMATION_MESSAGE);
                                cont = cont + 1;
                            }
                            temp3 = temp3.siguiente;
                        }
                    }
                    temp2 = temp2.siguiente;
                }
            }
            temp = temp.siguiente;
        }

    }

    /*-------------------------------------------------------------------------------------------------------------------------*/
    //usuarios predeterminados
    public void listaUsuarios() {
//ingresa los datos para tener usuario registrados sin necesidad de ingresar para pruebas
        insertaNodo("Jose", "123", "Jose Luis", "Carrillo Mendez", "Masculino", "13/08/1988", "85601120", "C4rr1ll0@hotmail.com", "Pital", "", "", "", "");
        insertaNodo("Luis", "123", "Juan Roberto", "Carrillo Rojas", "Masculino", "13/08/1998", "85601230", "Robert98@hotmail.com", "Aguas Zarcar", "", "", "", "");
        insertaNodo("Jenny", "123", "Jenny Maria", "Rogriguez Salas", "Femenina", "03/02/1992", "26458525", "JMSalas@gmail.com", "Pital", "", "", "", "");
        insertaNodo("Allan", "123", "Allan", "Jimenez Salazar", "Masculino", "25/12/1978", "85615220", "ASalazar@gmail.com", "Cuidad Quesada", "", "", "", "");
        insertaNodo("Luis", "123", "Luis", "Rojas Rojas", "Masculino", "13/08/1989", "85321420", "RRluis@hotmail.com", "Venecia", "", "", "", "");
    }

}
