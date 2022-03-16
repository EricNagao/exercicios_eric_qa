package EASY;
import javax.swing.JOptionPane;


public class Exercicio_03_Easy {
static String primeiroValor;
static String segundoValor;

public static void main(String[] args) {

    primeiroValor = JOptionPane.showInputDialog("Digite um valor: ");
    segundoValor = JOptionPane.showInputDialog("Digite o segundo valor: ");

    System.out.println("segundo valor: "+segundoValor);
    System.out.println("segue o primeiro valor: "+primeiroValor);
}
   
}