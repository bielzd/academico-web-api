package br.com.academico.pessoa;
import java.io.Serializable;

import br.com.academico.endereco.Endereco;

public abstract class Pessoa implements Serializable {

    // Atributos de Instância ou do Objeto
    private int matricula;
    private int idade;
    private String nome;
    private String sobrenome;
    private String naturalidade;
    private String cpf;
    private char sexo;
    private Endereco endereco; // Associação estrutural - Agregação -> a partir de atributo

    // Gets and Sets
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Atributo derivado -> a partir de método
    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Construtores
    public Pessoa() {
    }

    public Pessoa(int matricula, String nome, String sobrenome, int idade, String naturalidade, char sexo, String cpf,
            Endereco endereco) {
        this.matricula = matricula;
        this.idade = idade;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.naturalidade = naturalidade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
    }

    // Método toString
    @Override
    public String toString() {
        String detalhes = "";
        detalhes += "Matrícula: " + this.getMatricula() + " \n";
        detalhes += "Nome: " + this.getNome() + " \n";
        detalhes += "Sobrenome: " + this.getSobrenome() + " \n";
        detalhes += "Nome Completo: " + this.getNomeCompleto() + " \n";
        detalhes += "Idade: " + this.getIdade() + " \n";
        detalhes += "Naturalidade: " + this.getNaturalidade() + " \n";
        detalhes += "Sexo: " + this.getSexo() + " \n";
        detalhes += "CPF: " + this.getCpf() + " \n";
        detalhes += this.getEndereco();

        return detalhes;
    }

    // Método Equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa) {
            Pessoa pessoa = (Pessoa) obj;
            return this.matricula == pessoa.getMatricula();
        }
        return false;
    }

    // Método abstrato - Sem implementação
    // Usado para garantir que as classes que herdem de pessoa possuam uma implementação do gerarMatricula
    // Assim é possivel que cada classe que herde de pessoa implemente sua forma específica de gerar matricula
    public abstract int gerarMatricula();
}