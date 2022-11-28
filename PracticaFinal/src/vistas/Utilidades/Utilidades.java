/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Utilidades;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import modelo.Persona;
import modelo.enums.Genero;

/**
 *
 * @author DEEPIN
 */
public class Utilidades {

    public static void cargarGenero(JComboBox cbx) {
        cbx.removeAllItems();
        for (Genero genero : Genero.values()) {
            cbx.addItem(genero);
        }
    }

    public static Genero obtenGenero(JComboBox cbx) {
        return (Genero) cbx.getSelectedItem();
    }

    public static String DIRCARPDATA = "data";
    Gson gson = new Gson();

    public static boolean guardarJson(Persona[] personas) {
        Gson gson = new Gson();
        String json = gson.toJson(personas);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DIRCARPDATA + File.separatorChar + "datos.json"))) {
            bw.write(json);

            bw.close();
            return true;

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    public static Persona[] cargarJson() {
        Persona[] personas = null;
        Gson gson = new Gson();
        String json = "";

        try (BufferedReader br = new BufferedReader(new FileReader(DIRCARPDATA + File.separatorChar + "datos.json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                json = linea;
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        personas = gson.fromJson(json, Persona[].class);
        return personas;
    }
}
