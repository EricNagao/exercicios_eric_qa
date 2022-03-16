package MEDIUM;

import javax.swing.JOptionPane;

/*Exercício 5 - Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor. */
public class Exercicio_05_Med {
    public static void main(String[] args) {
        int numeroDigitado, menor=0,  i=0;

        while(i<=5){

            String numeroDigitadostg = JOptionPane.showInputDialog("Digite um numero: ");
            numeroDigitado = Integer.parseInt(numeroDigitadostg);
            if (numeroDigitado < menor || i==1 ){// lembrar de colocar “|| i==1, pois seria “e i igual a primeira interação e não teria problema.
               
                menor =numeroDigitado;
            } 
            i++;
            System.out.print(numeroDigitado +", ");

        }
        System.out.println("\n O menor número digitado foi o "+menor);
    }
    
}
