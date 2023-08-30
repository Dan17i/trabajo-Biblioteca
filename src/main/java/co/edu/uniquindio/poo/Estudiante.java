package co.edu.uniquindio.poo;
    /**
    *@author: Samuel Castaño
    *@author: Daniel Jurado
    *@author: Salomé Pérez
    * La clase Estudiante representa a un estudiante en el sistema y hereda de la clase Persona.
    */
public class Estudiante extends Persona {
    /** 
     * Atributo que representa el Programa académico que está cursando el estudiante
     */
    private String programa;

    /**
     * Método Contructor que sirve para crear una instacia de un estudiante
     * @param nombre
     * @param id
     * @param celular
     * @param correo
     * @param direccion
     * @param programa
     */
    public Estudiante(String nombre, String id, String celular, String correo, String direccion, String programa) {
        super(nombre, id, celular, correo, direccion);
        this.programa = programa;
    }

    /**
     * Método que obtiene el programa académico del estudiante
     * @return el programa encontrado del estudiante
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * Método que establece el programa académico del estudiante
     * @param programa
     */
    public void setPrograma(String programa) {
        this.programa = programa;
    }

//---------------------------------------------------------------------------------------------------------------
    /**
    * Método que sirve para actualizar un Estudiante 
    *@param estudiante
    *@return el estudiante actualizado
    */
    public Estudiante actualizarEstudiante (Estudiante estudiante){
        //TODO
    return null;
    }

    


}