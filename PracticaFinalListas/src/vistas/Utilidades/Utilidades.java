/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Utilidades;

import com.google.gson.Gson;
import controlador.PersonaController.PersonaController;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import modelo.enums.Genero;

/**
 *
 * @author DEEPIN
 */
public class Utilidades {

    public static String DIRCARPDATA = "data";

    public static void cargarGenero(JComboBox cbx) {
        cbx.removeAllItems();
        for (Genero genero : Genero.values()) {
            cbx.addItem(genero);
        }
    }

    public static Genero obtenGenero(JComboBox cbx) {
        return (Genero) cbx.getSelectedItem();
    }

    public static boolean guardarJSON(PersonaController personas) {
        Gson gson = new Gson();
        String json = gson.toJson(personas);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DIRCARPDATA + File.separatorChar + "datos.json"))) {
            bw.write(json);
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
        }

    }

    public static PersonaController cargarJSON() {
        String json = "";
        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(new FileReader(DIRCARPDATA + File.separatorChar + "datos.json"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                json += linea;
            }

            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        PersonaController personas = gson.fromJson(json, PersonaController.class);
        return personas;
    }
}
