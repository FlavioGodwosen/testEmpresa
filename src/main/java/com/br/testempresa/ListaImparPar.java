package com.br.testempresa;

public class ListaImparPar {

    public String getDados() {
        return "Impar:" + this.Impar +
                "\nPar:" + this.Par +
                "\nNumeros:" + this.Numeros +
                "\n" + "\n";
    }

    private String Impar;
    private String Par;
    private String Numeros;

    public ListaImparPar() {
    }

    public ListaImparPar(String impar, String par, String numeros) {
        this.Impar = impar;
        this.Par = par;
        this.Numeros = numeros;

    }

    public String getImpar() {
        return Impar;
    }

    public void setImpar(String impar) {
        Impar = impar;
    }

    public String getPar() {
        return Par;
    }

    public void setPar(String par) { Par = par;
    }

    public String getNumeros() { return Numeros;
    }

    public void setNumeros(String numeros) { Numeros = numeros; }
    }
