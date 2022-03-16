package EASY;
import javax.swing.JOptionPane;

//Exercício 7 -  Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do INSS a ser pago. 
//Respeitando a tabela abaixo: de  Contribuição (R$) Alíquota 
//Até R$ 1.045,00 			7,50% 
//De R$ 1.045,01 a R$ 2.089,60 		9%
//De R$ 2.089,61 até R$ 3.134,40	 12%
//De R$ 3.134,41 até R$ 6.101,06	 14% 
public class Exercicio_07_Easy {
 
public static void main(String[] args) {
    double salario, inss=0;
    String salariostg = JOptionPane.showInputDialog("Digite um valor de salario: ");
    salario = Double.parseDouble(salariostg);

    if(salario<=1045){
        inss= salario*0.075;
    }
    if(salario>=1045.01 && salario<= 2089.60){
        inss =salario*0.09;
    }
    if(salario>=2089.61 && salario<= 3134.40){
        inss=salario*0.12;
    }
    if(salario>=3134.41 && salario<= 6101.06){
        inss=salario*0.14;
    }       
    if(salario>6101.06){
        inss=854.15;
    }
		
   System.out.println("o valor pago de INSS é: " +inss);

    }
}
