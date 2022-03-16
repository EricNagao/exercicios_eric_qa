package MEDIUM;
/*Exercício 3 - Faça um algoritmo para calcular e exibir a soma de todos 
os números de 0 a 1000. E parar se caso a soma atingir 1500(ou mais). */
public class Exercicio_03_Med {
    public static void main(String[] args) {
        int numero=0, i=0;
  

        while(i<1000){
            numero=numero+i;
            i++;
            System.out.println(numero);
            if(numero>=1500){
                break;
            }
        }
    }
}
