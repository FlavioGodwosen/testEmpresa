package com.br.testempresa;

import java.util.ArrayList;

public class ListaNumeros {

    public static void main(String[] args) {
        ArrayList<ListaImparPar> ListaNumeros = new ArrayList();

        ListaImparPar i1 = new ListaImparPar();
        i1.setImpar("15,25,35");
        i1.setPar("0,20,30,40");
        i1.setNumeros("0,15,20,25,30,35,40");
        ListaNumeros.add(i1);

        for (int i = 0; i < ListaNumeros.size(); i++) {
            ListaImparPar n = ListaNumeros.get(i);
            if (n.getImpar().equals("15,25,35")) {
                //ListaItens.remove(v);

            }
        }

        for (int i = 0; i < ListaNumeros.size(); i++) {
            ListaImparPar n = ListaNumeros.get(i);
            if (n.getPar().equals("0,20,30,40")) {
                //ListaItens.remove(n);

            }
        }

        for (int i = 0; i < ListaNumeros.size(); i++) {
            ListaImparPar n = ListaNumeros.get(i);
            if (n.getNumeros().equals("15,30")) {
                //ListaItens.remove(n);

            }
        }

        for (int i = 0; i < ListaNumeros.size(); i++) {

            ListaImparPar n = ListaNumeros.get(i);

            System.out.println("15,30");
        }

    }
}

