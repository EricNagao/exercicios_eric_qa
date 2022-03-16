package MEDIUM;
/*Exercício 1 - Faça um algoritmo para verificar e exibir de 0 a 100, quais são os
números Pares e ímpares.*/ 

public class Exercicio_01_Med {
    public static void main(String[] args) {
        int i=0;
        while(i<=100){
            if(i % 2 == 0 ){
                System.out.println("exibir numero " + i +" par" );
            }else{
                System.out.println("exibir numero " + i +" impar");
            }
            i++;
        }
    }
}
