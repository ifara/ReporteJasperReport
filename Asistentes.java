package reportes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Asistentes
 * @author Sandra
 */
public class Asistentes {
    
    private Integer id;
    private String nombre;
    private String apellidos;
    private String dni;

    /**
     * Constructor por defecto
     */
    public Asistentes(){
        
    }
    
    /**
     * Constructor parametrizado
     * @param id
     * @param nombre
     * @param apellidos
     * @param dni 
     */
    public Asistentes(int id, String nombre, String apellidos, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    
    /**
     * Obtener id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Asignar Id
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtener Apellidos
     * @return 
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Asignar apellidos
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtener DNI
     * @return 
     */
    public String getDni() {
        return dni;
    }

    /**
     * Asignar DNI
     * @param dni 
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtener Nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Asignar Nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
