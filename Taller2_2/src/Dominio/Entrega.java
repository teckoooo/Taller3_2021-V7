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
public abstract class Entrega {
	private String codigo;
	private int gramos;
	double valor;
	private Cliente remitente;
	private Cliente destinatario;
	
    /**
     *
     * @param codigo
     * @param gramos
     */
    public Entrega(String codigo, int gramos) {
		this.codigo = codigo;
		this.gramos = gramos;
		this.valor = 0;
		this.remitente = null;
		this.destinatario = null;
	}

    /**
     *
     * @return
     */
    public String getCodigo() {
		return codigo;
	}

    /**
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

    /**
     *
     * @return
     */
    public int getGramos() {
		return gramos;
	}

    /**
     *
     * @param gramos
     */
    public void setGramos(int gramos) {
		this.gramos = gramos;
	}

    /**
     *
     * @return
     */
    public double getValor() {
		return valor;
	}

    /**
     *
     * @param valor
     */
    public abstract void setValor(double valor);

    /**
     *
     * @return
     */
    public Cliente getRemitente() {
		return remitente;
	}

    /**
     *
     * @param remitente
     */
    public void setRemitente(Cliente remitente) {
		this.remitente = remitente;
	}

    /**
     *
     * @return
     */
    public Cliente getDestinatario() {
		return destinatario;
	}

    /**
     *
     * @param destinatario
     */
    public void setDestinatario(Cliente destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return "Entrega [codigo: " + codigo + ", valor: " + valor + ", remitente: " + remitente.getRut() + ", destinatario:  "
				+ destinatario.getRut() + "]";
	}
}