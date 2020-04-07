package com.br.testempresa;

import java.util.ArrayList;



public class ListaItens {
    public static void main(String[] args) {
        ArrayList<ListaComidas> ListaItens = new ArrayList();

       ListaComidas i1 = new ListaComidas();
       i1.setNome("Creme de Abacate");
       i1.setIngredientes("Leite, Açucar, Abacate");
       i1.setValidade("Até amanhã");
       ListaItens.add(i1);

       ListaComidas i2 = new ListaComidas();
       i2.setNome("Bolo de Mamão");
       i2.setIngredientes("Farinha, Leite, Mamão");
       i2.setValidade("Até hoje");
       ListaItens.add(i2);

       ListaComidas i3 = new ListaComidas();
       i3.setNome("Sopa de Atum");
       i3.setIngredientes("Água, Sal, Atum");
       i3.setValidade("Já venceu");
       ListaItens.add(i3);

        for(int i = 0; i <ListaItens.size();i++){
            ListaComidas v = ListaItens.get(i);
            if(v.getValidade().equals("Até amanhã")){
                ListaItens.remove(v);

            }
        }
        for(int i = 0; i <ListaItens.size();i++){
            ListaComidas v = ListaItens.get(i);
            if(v.getValidade().equals("Já venceu")){
                ListaItens.remove(v);

            }
        }

       for (int i=0;i<ListaItens.size();i++) {

           ListaComidas temp = ListaItens.get(i);

           System.out.println(temp.getValidade());
       }


    }
}




