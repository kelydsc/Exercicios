package br.com.digitalhouse.Exercicio01;

import java.util.ArrayList;

public class Exercicio01 {

    public static void main(String[] args) {

        ArrayList<String> listaAnimais = new ArrayList<>();
        listaAnimais.add("Pato");
        listaAnimais.add("Cachorro");
        listaAnimais.add("Gato");

        System.out.println("Lista de animais: ");

        for(int posicao = 0;posicao < listaAnimais.size();posicao++) {

            try{
                System.out.println(listaAnimais.get(3));
            }catch (Exception ex){
                System.out.println("Deu exception de index");
                ex.getMessage();
                ex.printStackTrace();
            }finally {
                System.out.println("Deu erro");
            }
            //System.out.println(listaAnimais.get(posicao));
        }
    }
}
