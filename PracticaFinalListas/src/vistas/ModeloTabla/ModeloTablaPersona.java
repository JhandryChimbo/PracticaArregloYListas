/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.ModeloTabla;

import javax.swing.table.AbstractTableModel;
import modelo.Persona;
import modelo.listas.ListaEnlazada;

/**
 *
 * @author DEEPIN
 */
public class ModeloTablaPersona extends AbstractTableModel {

    private ListaEnlazada<Persona> lista = new ListaEnlazada<>();

    public ListaEnlazada<Persona> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<Persona> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public String getColumnName(int column) {

        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Fecha Nacimiento";
            case 2:
                return "Edad";
            case 3:
                return "Genero";
            case 4:
                return "Clasificacion";
            case 5:
                return "Practicas";

            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = null;
        try {
            p = lista.obtener(rowIndex);
        } catch (Exception e) {
        }
        switch (columnIndex) {
            case 0:
                return (p != null) ? p.getNombre() : "No registrado";
            case 1:
                return (p != null) ? p.getFechaNac() : "No registrado";
            case 2:
                return (p != null) ? p.getEdad() : "No registrado";
            case 3:
                return (p != null) ? p.getGenero() : "No registrado";
            case 4:
                return (p != null) ? p.getClasificacionE() : "No registrado";
            case 5:
                return (p != null) ? p.getPracticas() : "No registrado";
            default:
                return null;
        }
    }
}
