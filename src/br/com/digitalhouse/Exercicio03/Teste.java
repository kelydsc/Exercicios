package br.com.digitalhouse.Exercicio03;

public class Teste {

    public static void main(String[] args) {

        CalculoMatematico calculoMatematico = new CalculoMatematico();


        try{
            calculoMatematico.divisao(4,0);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
