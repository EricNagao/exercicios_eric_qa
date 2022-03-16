package EASY;
import javax.swing.JOptionPane;
//Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E
//SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//exibir exame. 
public class Exercicio_06_Easy {
    

public static void main(String[] args) {
    
    double nota1, nota2;
    double resultado;
    String nota1stg, nota2stg;

    nota1stg = JOptionPane.showInputDialog("Digite a nota 1: ");
    nota2stg = JOptionPane.showInputDialog("Digite a nota 2: ");
    
    nota1 = Integer.parseInt(nota1stg);
    nota2 = Integer.parseInt(nota2stg);
    resultado = (nota1+nota2)/2;

    if (resultado > 5){
        System.out.println("aprovado!");
    }
    if(resultado < 5){
        System.out.println("Reprovado!");
    }
    if(resultado==5){
        System.out.println("Exame!");
    }
            
}
}
