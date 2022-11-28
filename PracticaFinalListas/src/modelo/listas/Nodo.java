/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.listas;

/**
 *
 * @author DEEPIN
 */
public class Nodo<E> {

    private E dato;
    private Nodo<E> siguiente;

    public Nodo(E dato, Nodo<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }

}
