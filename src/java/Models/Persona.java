/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 ***************************************************
 * Created on : 10/05/2018, 12:15:02 PM Author : Rodrigo R. Rubio Haro Company :
 * Aguila bicefala **************************************************
*
 */
public class Persona {

    private int id;
    private String Correo;
    private String Nombre;
    private int Edad;

    public Persona() {
    }

    public Persona(int id, String Correo, String Nombre, int Edad) {
        this.id = id;
        this.Correo = Correo;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

}
