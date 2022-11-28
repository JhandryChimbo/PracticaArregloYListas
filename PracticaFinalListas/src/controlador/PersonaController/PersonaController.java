/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.PersonaController;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import modelo.Persona;
import modelo.listas.ListaEnlazada;

/**
 *
 * @author DEEPIN
 */
public class PersonaController {

    private ListaEnlazada<Persona> lista = new ListaEnlazada<>();
    private Persona persona;

    public PersonaController() {
    }

    public Integer calcularEdad(String fechaNac) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatter);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());

        return edad.getYears();
    }

    public String clasificarEdad(Integer edad) {

        if (edad <= 12) {
            persona.setClasificacionE("Ninio");
        } else if (edad <= 29) {
            persona.setClasificacionE("Joven");
        } else if (edad <= 64) {
            persona.setClasificacionE("Adulto");
        } else {
            persona.setClasificacionE("Tercera Edad");
        }

        return persona.getClasificacionE();
    }

    public String practicasEdad(Integer edad) {
        if (edad <= 12) {
            persona.setPracticas("Utilizar soluciones hipertónicas");
        } else if (edad <= 29) {
            persona.setPracticas("Tomar paracetamol 500mg");
        } else if (edad <= 64) {
            persona.setPracticas("Evitar ingerir alcohol");
        } else {
            persona.setPracticas("Mantenerse hidratado");
        }

        return persona.getPracticas();

    }

//    public boolean guardar() throws Exception {
//        guardar(this.persona);
//        return true;
//    }

    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ListaEnlazada<Persona> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<Persona> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "PersonaController{" + "lista=" + lista + ", persona=" + persona + '}';
    }

    
    

}
