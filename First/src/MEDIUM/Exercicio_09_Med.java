package MEDIUM;

import javax.swing.JOptionPane;

/*Exercício 9 - Faça um algoritmo para: Criar dois vetores. Em um vetor: 
ler e armazenar o nomes de alunos. No outro vetor: ler e armazenar a
 numeração de cada aluno, de acordo com a ordem inserida no vetor de nomes. 
 E exiba, o Nome e o número correspondente de cada um. */
public class Exercicio_09_Med {
public static void main(String[] args) {

        int a=2, i=0;
        String nomeAluno[] = new String [a];
        int alunoNumero[] = new int [a];
  


        while(i<a){
            nomeAluno[i] = JOptionPane.showInputDialog("Digite o NOME  do Aluno> ");
            alunoNumero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o NUMERO do aluno> "));
            i++;

        }
        i=0;

        while (i<a) {
            System.out.println("O nome do aluno> " + nomeAluno[i] + " - " + alunoNumero[i]);
            i++;

        }


    }
}
