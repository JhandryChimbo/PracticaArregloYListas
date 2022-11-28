/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.Utilidades;


import javax.swing.JComboBox;
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
}
