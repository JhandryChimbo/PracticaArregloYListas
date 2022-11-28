/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DEEPIN
 */
public class Persona {

    private String nombre;
    private String fechaNac;
    private Integer edad;
    private String genero;
    private String clasificacionE;
    private String practicas;

    public Persona() {

    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacionE() {
        return clasificacionE;
    }

    public void setClasificacionE(String clasificacionE) {
        this.clasificacionE = clasificacionE;
    }

    public String getPracticas() {
        return practicas;
    }

    public void setPracticas(String practicas) {
        this.practicas = practicas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", edad=" + edad + ", genero=" + genero + ", clasificacionE=" + clasificacionE + ", practicas=" + practicas + '}';
    }
    
    
}
