package MEDIUM;
/*Exercício 4 - Faça um algoritmo para calcular e exibir a multiplicação de todos os números de 1 a 1000. 
E toda vez que resultado chegar ou ultrapassar 1000, faça que o resultado das multiplicações volte a ser 1. */
public class Exercicio_04_Med {public static void main(String[] args) {
    int i=1, resultadoMutiplicacao = i;

        while(1<=1000){
            resultadoMutiplicacao=resultadoMutiplicacao*i;
            System.out.println("O resultado da mutiplicação é: "+ resultadoMutiplicacao);
        if(resultadoMutiplicacao>=1000){
            resultadoMutiplicacao=1;
        }
        i++;
        }
    }
}
