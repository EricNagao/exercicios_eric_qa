package EASY;
/*Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
Respeitando a tabela abaixo: 
//Até R$ 1.045,00 			7,50% 
//De R$ 1.045,01 a R$ 2.089,60 		9%
//De R$ 2.089,61 até R$ 3.134,40	 12%
//De R$ 3.134,41 até R$ 6.101,06	 14% 
*/

import javax.swing.JOptionPane;

public class Exercicio_08_Easy {
    public static void main(String[] args) {
        
        double salario, salarioLiquido=0, impostoRenda=0; 
        String salariostg = JOptionPane.showInputDialog("Digite o salario: ");
        salario = Double.parseDouble(salariostg);

        if(salario<=1903.98){
            impostoRenda=0 ;
            salarioLiquido=salario-impostoRenda;
            System.out.println("isento, não pagara nada");
        }
       
        if (salario>=1903.99 && salario<= 2826.65) {
            impostoRenda=(salario*0.075)-142.8;
		    salarioLiquido=salario-impostoRenda;
        }
		
        if (salario>=2826.66 && salario<= 3751.05){
            impostoRenda=(salario*0.15)-354.8;
            salarioLiquido= salario- impostoRenda;
        }
		
        if(salario>=3751.06 && salario<= 4664.68){
            impostoRenda=(salario*0.225)-636.13;
            salarioLiquido=salario-impostoRenda;
        }
	
        if(salario>4664.68){
            impostoRenda=(salario*0.275)-869.36;
            salarioLiquido=salario-impostoRenda;
        }

        System.out.println("");
        System.out.println("salario bruto é R$: "+salario);
        System.out.println("impostoRenda pago é: "+impostoRenda);
        System.out.println("Salario líquido é R$"+salarioLiquido);
    
    }

}
