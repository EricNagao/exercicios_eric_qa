package MEDIUM;

import javax.swing.JOptionPane;

/*Exercício 2 - Faça um algoritmo para ler um valor de investimento, com uma taxa
de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e
o total. Considerando que a remuneração será no regime de juros compostos.  */
public class Exercicio_02_Med {
    public static void main(String[] args) {
        double valorInvestimento, jurosTotalAtualizado, taxaJuros=0.05;
        int ano =0, tempoInvestido=10;

        String valorInvestimentostg = JOptionPane.showInputDialog("Digite um valor de investimento: ");
        valorInvestimento = Double.parseDouble(valorInvestimentostg);

        jurosTotalAtualizado =valorInvestimento;

        while(ano <=  tempoInvestido ){
            jurosTotalAtualizado = (jurosTotalAtualizado *taxaJuros)+jurosTotalAtualizado;
            ano++;
        }
        System.out.println("O valor investimento são: R$"+valorInvestimento);
        System.out.println("O valor do juros são: R$"+ (jurosTotalAtualizado-valorInvestimento));
        System.out.println("O valor total do investimento são: R$"+jurosTotalAtualizado);
    }
}
