package MEDIUM;
/*Exercício 6 - Faça um algoritmo para ler um número inteiro,
 calcular e exibir o Fatorial do número digitado. Ex.: 
 Digitou 10. 10*(10-1)*(10-2)*(10-3).. *(10-1) = 3.628.800 */

import javax.swing.JOptionPane;

public class Exercicio_06_Med {
    public static void main(String[] args) {
        int Fatorial, i;

        String fatorString = JOptionPane.showInputDialog("Digite o valor para o Fatorial: ");
        Fatorial = Integer.parseInt(fatorString);
        i=Fatorial;

        while(i>1){
            System.out.println("o fatorial = "+Fatorial +"x"+(i-1) +" = "+ (Fatorial*(i-1)));
            Fatorial = Fatorial*(i-1);
            i--;
        }
        System.out.println(" O fatorial do numero digitado é: " +Fatorial);
    }
}
