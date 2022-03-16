package EASY;
import javax.swing.JOptionPane;

/*Exercício 9 - Faça um algoritmo para ler um número inteiro entre: 1 a 10, 
calcular e exibir a tabuada deste número digitado.
 Ex.: 10 x 1 = 10, .., 10 x 10 = 100.
 */
public class Exercicio_09_Easy {
    public static void main(String[] args) {

      int numeroDigitado, calcular, i=1;
        String numeroDigitadostg = JOptionPane.showInputDialog("Digite um numero para tabuada ");
        numeroDigitado = Integer.parseInt(numeroDigitadostg);

        while(i<=10){
            calcular=numeroDigitado*i;
            System.out.println(numeroDigitado + " x " + i + "=" + calcular );
            i++;
        }
    }
}
