/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.listas;

import controlador.Excepciones.ListaNullException;
import controlador.Excepciones.PosicionNoEncontradaException;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;
import modelo.Persona;

/**
 *
 * @author DEEPIN
 */
public class ListaEnlazada<E> {

    private Nodo<E> cabecera;
    private Integer size;

    public ListaEnlazada() {
        cabecera = null;
        size = 0;
    }

    public Boolean estaVacia() {
        return cabecera == null;
    }

    public void insertarPersona(E dato) {
        Nodo<E> nodo = new Nodo<>(dato, null);
        if (estaVacia()) {
            this.cabecera = nodo;

        } else {
            Nodo<E> aux = cabecera;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
        size++;
    }

    public void imprimir() {
        Nodo<E> aux = cabecera;
        while (aux != null) {
            System.out.print(aux.getDato().toString() + "\t");
            aux = aux.getSiguiente();
        }
    }

    public E obtener(Integer pos) throws ListaNullException, PosicionNoEncontradaException {
        if (!estaVacia()) {
            E dato = null;
            if (pos >= 0 && pos < size) {
                if (pos == 0) {
                    dato = cabecera.getDato();
                } else {
                    Nodo<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSiguiente();

                    }
                    dato = aux.getDato();
                }

            } else {
                throw new PosicionNoEncontradaException();
            }
            return dato;

        } else {
            throw new ListaNullException();
        }
    }


    public Nodo<E> getCabecera() {
        return cabecera;
    }

    public void setCabecera(Nodo<E> cabecera) {
        this.cabecera = cabecera;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ListaEnlazada{" + "cabecera=" + cabecera + ", size=" + size + '}';
    }

    
}
