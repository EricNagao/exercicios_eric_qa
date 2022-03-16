package EASY;

import javax.swing.JOptionPane;

public class Exercicio_05_Easy_2 {
public static void main(String[] args) {

    int numero1, numero2, numero3;
    int soma, Mult, Sub, media;

    String numero1stg = JOptionPane.showInputDialog("Digite o numero 1: ");
    numero1 = Integer.parseInt(numero1stg);

    String numero2stg = JOptionPane.showInputDialog("Digite o numero 2: ");
    numero2 = Integer.parseInt(numero2stg);    
    
    String numero3stg = JOptionPane.showInputDialog("Digite o numero 3: ");
    numero3 = Integer.parseInt(numero3stg);


	soma = numero1 + numero2 + numero3;
	Sub =numero1 - numero2 - numero3;
	Mult =numero1 * numero2 * numero3;
    media = (numero1 + numero2 + numero3 )/3;
    
        System.out.println("A soma dos números "+numero1 + " + "+numero2 + " + " +numero3+ " = "+ soma);
        System.err.println("A Sub dos números "+numero1 + " - "+numero2 + " - " +numero3+ " = "+ Sub);
        System.out.println("A Mult dos números "+numero1 + " * "+numero2 + " * " +numero3+ " = "+ Mult);
        System.out.println("A media dos números "+numero1 + " + "+numero2 + " + " +numero3+ " = "+ media);

    }

}
