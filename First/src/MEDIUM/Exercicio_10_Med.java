/*Exercício 10 - Faça um algoritmo que calcule e exiba a sequencia de Fibonacci até 
o 10º elemento. Ex.: 0, 1,1 .. 34. Usando Vetor, para armazenar o resultado. 
A sequencia de Fibonacci, é calcula com a soma dos 2 termos anteriores, sendo 
o primeiro e o segundo são 0 e 1, respectivamente. 0, 1, 1, 2, 3, 5, 8, 13 .. 21. */

package MEDIUM;

import javax.swing.JOptionPane;

public class Exercicio_10_Med {
    public static void main(String[] args) {
        int i=2, elemento;

        String elementostg = JOptionPane.showInputDialog("digite o numero da fibbo: ");
        elemento = Integer.parseInt(elementostg);

        int[] fibbo = new int [elemento];//quando usa new, ele da vida ao objeto
        fibbo[0] = 0;
        fibbo[1] = 1;

        while (i<elemento) {
            fibbo[i] = fibbo[i-1] + fibbo[i-2];
            i++;
        }   
        i=0;
            while (i<elemento) {
                System.out.println("termo"+(i+1)+" - valor: " +fibbo[i]);
                i++;
            }
    }
}
