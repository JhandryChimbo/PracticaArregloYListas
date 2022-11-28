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

/**
 *
 * @author DEEPIN
 */
public class PersonaController {

    public static String NCOMUNS = "Sin registrar";
    public static String NFECHA = "dd/MM/yyyy";

    private Persona personas[];
    private Persona persona;

    public PersonaController() {
    }

    public PersonaController(Integer nroPersonas) {
        personas = new Persona[nroPersonas];
        for (int i = 0; i < nroPersonas; i++) {
            Persona p = new Persona();
            p.setNombre(NCOMUNS);
            p.setFechaNac(NFECHA);
            p.setEdad(0);
            p.setGenero(NCOMUNS);
            p.setClasificacionE(NCOMUNS);
            p.setPracticas(NCOMUNS);
            personas[i] = p;
        }
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

    public String practicasEdad(Integer edad){
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
    public boolean modificarPersona(Persona persona, Integer pos) {
        getPersonas()[pos] = persona;
        return true;
    }

    public static String getNCOMUNS() {
        return NCOMUNS;
    }

    public static void setNCOMUNS(String NCOMUNS) {
        PersonaController.NCOMUNS = NCOMUNS;
    }

    public static String getNFECHA() {
        return NFECHA;
    }

    public static void setNFECHA(String NFECHA) {
        PersonaController.NFECHA = NFECHA;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
