package br.com.academico.aluno;

import java.io.Serializable;

public class Nota implements Serializable {

    // Atributos de Instância ou do Objeto
    private double valor;
    private int id, peso, matricula;

    // Gets and Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Construtores
    public Nota() {
    }

    public Nota(double valor, int peso) {
        this.valor = valor;
        this.peso = peso;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nota [peso=" + peso + ", valor=" + valor + "]";
    }
}