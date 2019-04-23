package br.com.digitalhouse.Exercicio03;

public class CalculoMatematico {

    public int divisao(int numero1, int numero2) throws ArithmeticException{

        if(numero2 == 0){
            throw new ArithmeticException("A operação não pode ser realizada!");
        }

        int resultado = 0;

/*        try{
            resultado = numero1 / numero2;
        }catch (ArithmeticException ex){

            System.out.println("A operação não pode ser realizada!");
            return 0;
        }*/
        return resultado;
    }
}
