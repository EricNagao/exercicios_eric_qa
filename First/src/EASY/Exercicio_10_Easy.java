package EASY;

import javax.swing.JOptionPane;

/*Exercício 10 - Faça um algoritmo para ler um valor de investimento, com uma taxa de 
juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros e o 
total com juros. Considerando que a remuneração será no regime de juros simples.*/

public class Exercicio_10_Easy {
    public static void main(String[] args) {
        double valorJuros=0, valorInvestido=0, TotalComJuros=0 ;
        int ano = 1;
        String valorInvestidostg = JOptionPane.showInputDialog("Digite o valor inicial para investimento> ");
        valorInvestido = Double.parseDouble(valorInvestidostg);


            while (ano<=10){
                valorJuros=(valorInvestido*0.05)+valorJuros;
	            ano = ano +1;
            }
	
	        TotalComJuros = valorJuros + valorInvestido;
            System.out.println("O valor investido foi R$ "+ valorInvestido);
            System.out.println("O valor do juros R$ "+ valorJuros);
            System.out.println("O valor total investido foi R$ "+ TotalComJuros);
    }
}
