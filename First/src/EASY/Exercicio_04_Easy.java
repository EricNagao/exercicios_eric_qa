package EASY;
import javax.swing.JOptionPane;

public class Exercicio_04_Easy {
public static void main(String[] args) {
    int numeroDigitado, Resultado;
    String numeroStringUsuario = JOptionPane.showInputDialog("Digite um numero: ");

    numeroDigitado = Integer.parseInt(numeroStringUsuario);
    Resultado = numeroDigitado*2;

    System.out.println("O dobro do numero digitado é: "+Resultado);
    System.out.println("O dobro do numero "+numeroDigitado +" é "+ Resultado);
    JOptionPane.showMessageDialog(null, "O dobro do numero "+numeroDigitado +" é "+ Resultado); //essa expressão, é para mostrar o resultado em popup

    }    
}
