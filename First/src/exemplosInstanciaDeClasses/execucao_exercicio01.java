package exemplosInstanciaDeClasses;

import javax.swing.JOptionPane;

public class execucao_exercicio01 {
    public static void main(String[] args) {
        
        Exercicio01_instancia modelagem = new Exercicio01_instancia();  
        System.out.println(modelagem.qualNome);

        String nome = JOptionPane.showInputDialog("digite o nome do dog: ");
        System.out.println("O nome do cachorro é: "+ nome);

        System.out.println("Qual a idade dele? ");
        System.out.println("a idade dele é: "+ modelagem.idade(2));
        System.out.println("que "+nome +" bonitinho");

        modelagem.lateCoracao();
    }
    
}
