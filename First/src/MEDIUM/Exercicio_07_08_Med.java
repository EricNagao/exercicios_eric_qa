package MEDIUM;


/*Exercício 7 - Faça um algoritmo para ler todos os meses do ano, armazene em um vetor */
public class Exercicio_07_08_Med {
    public static void main(String[] args) {
        String  vetorMeses[];

        vetorMeses = new String [12];

            vetorMeses[0]="Jan";
            vetorMeses[1]="Fev";
            vetorMeses[2]="Mar";
            vetorMeses[3]="Abr";
            vetorMeses[4]="Mai";
            vetorMeses[5]="Jun";
            vetorMeses[6]="Jul";
            vetorMeses[7]="Ago";
            vetorMeses[8]="Set";
            vetorMeses[9]="Out";
            vetorMeses[10]="Nov";
            vetorMeses[11]="Dez";

            int i=0;

            while(i<12){

                System.out.println("O Mês "+ (i+1) + " - " + vetorMeses[i]);
                i++;

            }
    
        }
}

