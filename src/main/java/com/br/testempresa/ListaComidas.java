package com.br.testempresa;



public class ListaComidas {

    public String getDados(){
        return "Nome:"+this.Nome+
                "\nIngredientes:"+this.Ingredientes+
                "\nValidade:"+this.Validade+
                "\n"+ "\n";


    }

    private String Nome;
    private String Ingredientes;
    private String Validade;


    public ListaComidas() {
    }

    public ListaComidas(String nome, String ingredientes, String validade) {
        this.Nome = nome;
        this.Ingredientes = ingredientes;
        this.Validade = validade;
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        Ingredientes = ingredientes;
    }

    public String getValidade() {
        return Validade;
    }

    public void setValidade(String validade) {
        Validade = validade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;

    }
}