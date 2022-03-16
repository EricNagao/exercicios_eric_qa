package EASY;
/*Exercício 11 - Faça um algoritmo para ler um número inteiro, somar 2 ao número
digitado, até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
completar 100 iterações.*/

import javax.swing.JOptionPane;

public class Exercicio_11_Easy {
    public static void main(String[] args) {
        int numero, i=1;

        String numerostg = JOptionPane.showInputDialog("Digite um numero: ");
        numero = Integer.parseInt(numerostg);   
        
        while(i<=100){
            numero=numero+2;
            i++;
            
            System.out.print(numero + ", ");
        }
        System.out.print("O valor total digitado: "+numero);
    }
}
