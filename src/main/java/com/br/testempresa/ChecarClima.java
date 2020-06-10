package com.br.testempresa;

public class ChecarClima {

    public static void main (String[] args) {

        String Clima1 = "chuva";
        String Clima2 = "sol";




        if ("chuva" != Clima1) {
            System.out.println("Você deveria pegar um guarda-chuva");
        }else if ("sol" == Clima2) {
            System.out.println("sem chuvas hoje! Pegue somente seus óculo de sol");
        }else
        System.out.println("Você não precisará de nenhum acessório hoje, somente seja feliz");
    }

}


