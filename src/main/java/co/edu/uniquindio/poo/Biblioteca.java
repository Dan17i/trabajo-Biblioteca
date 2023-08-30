package co.edu.uniquindio.poo;

import java.util.ArrayList;
/**
 *@author: Samuel Castaño
 *@author: Daniel Jurado
 *@author: Salomé Pérez
 * La clase Biblioteca representa una biblioteca y permite gestionar personas, empleados,
 * estudiantes y libros en la biblioteca.
 */
public class Biblioteca {

    /**
    * Listas de Personas y libros que vamos a utilizar en el desarrollo del código.
    */
    public ArrayList <Persona> listaPersonas;
    public ArrayList <Libro> listaLibro;

    /**
    * Metodo constructor que sirva para crear una instancia de la clase Biblioteca
    * @param listaPersonas
    * @param listaLibro
    */  
    public Biblioteca(ArrayList<Persona> listaPersonas, ArrayList<Libro> listaLibro) {
        this.listaPersonas = listaPersonas;
        this.listaLibro = listaLibro;
    }

    /**
     * Obtiene la lista de personas en la Biblioteca
     * @return la lista de personas
     */
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }[]

    /**
     * Estalece la lista de personas en la Biblioteca
     * @param listaPersonas
     */
    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    /**
     * obtiene la lista de libros en la biblioteca
     * @return la lisa de libros
     */
    public ArrayList<Libro> getListaLibro() {
        return listaLibro;
    }

    /**
     * Establece la lista de libros en la Biblioteca
     * @param listaLibro
     */
    public void setListaLibro(ArrayList<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

//------------------------------------------------------------------------------------------------------------------
    /**
     * Método que sirva oara registrar un libro desde la biblioteca
     * @param libro
     * @return el libro ya creado 
     */
    public Libro crearLibro(Libro libro){
        return null;
    }

//------------------------------------------------------------------------------------------------------------------
    /**
     * Método que sirve para registrar un estudiante desde la biblioteca
     * @param estudiante
     * @return el estudiante ya creado
     */
    public Estudiante crearEstudiante(Estudiante estudiante){
        return null;
    }
//------------------------------------------------------------------------------------------------------------------
    /**
     * Método que sirva para crear un empleado desde la biblioteca
     * @param empleado
     * @return el empleado ya creado
     */
    public Empleado crearEmpleado(Empleado empleado){
        return null;
    }

    
}
