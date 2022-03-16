package EASY;
import javax.swing.JOptionPane;

//Exercício 5 - Faça um algoritmo para ler três números inteiros, armazenar em 
//variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
//digitados.

public class Exercicio_05_Easy {
    
    public static void main(String[] args) {

        int primeiroNumero, segundoNumero, terceiroNumero;
        String primeiroDigitadostg = JOptionPane.showInputDialog("Digite o Primeiro numero: ");
        String segundoDigitadostg = JOptionPane.showInputDialog("Digite o Segundo numero: ");
        String terceiroDigitadostg = JOptionPane.showInputDialog("Digite o Terceiro numero: ");

        primeiroNumero = Integer.parseInt(primeiroDigitadostg);
        segundoNumero = Integer.parseInt(segundoDigitadostg);
        terceiroNumero = Integer.parseInt(terceiroDigitadostg);

        
        System.out.println("A soma dos 3 numeros digitados é: " +(primeiroNumero +segundoNumero +terceiroNumero));
        System.out.println("A mutiplicação dos numeros: "+(+primeiroNumero *segundoNumero *terceiroNumero));  
        System.out.println("A subtração dos numeros: " +(primeiroNumero -segundoNumero -terceiroNumero));
        System.out.println("A média dos numeros: " +((primeiroNumero +segundoNumero+terceiroNumero)/3));
    }
}
