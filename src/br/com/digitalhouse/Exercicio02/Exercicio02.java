package br.com.digitalhouse.Exercicio02;

import java.util.ArrayList;

public class Exercicio02 {

    public static void main(String[] args) {

        //ArrayList<String> listaAnimais = null;

        ArrayList<String> listaAnimais = new ArrayList<>();

        listaAnimais.add("Pato");
        listaAnimais.add("Cachorro");
        listaAnimais.add("Gato");

       try {
           //System.out.println(listaAnimais.get(2));
           System.out.println(listaAnimais.get(5));

       }catch (IndexOutOfBoundsException ex) {
           System.out.println("Deu exception de index");
           ex.getMessage();
           ex.printStackTrace();

       }catch (Exception ex){
           System.out.println("Deu erro denovo");

       }finally {
           System.out.println("Deu erro");
       }

    }
}
