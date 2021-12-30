/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Sergio Barraza Araya
 */
public class NodoEntrega {
   
	private NodoEntrega next;
	private NodoEntrega prev;
	private Entrega entrega;
	
    /**
     *
     * @param entrega
     */
    public NodoEntrega( Entrega entrega) {
		this.next = null;
		this.prev = null;
		this.entrega = entrega;
	}

    /**
     *
     * @return
     */
    public NodoEntrega getNext() {
		return next;
	}

    /**
     *
     * @param next
     */
    public void setNext(NodoEntrega next) {
		this.next = next;
	}

    /**
     *
     * @return
     */
    public NodoEntrega getPrev() {
		return prev;
	}

    /**
     *
     * @param prev
     */
    public void setPrev(NodoEntrega prev) {
		this.prev = prev;
	}

    /**
     *
     * @return
     */
    public Entrega getEntrega() {
		return entrega;
	}

    /**
     *
     * @param entrega
     */
    public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
}
