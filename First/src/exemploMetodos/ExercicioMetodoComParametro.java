package exemploMetodos;

public class ExercicioMetodoComParametro {
    
    public static void main(String[] args) {
        System.out.println(exibirNomeIdade(30, "Eric"));
        System.out.println(retornarPalavra("ole ole ola"));
        System.out.println(retornaDobro(5));
        System.out.println(retornaNomeSobrenome("Eric", "Nagao"));
        System.out.println(retornaSalario(3000));

        exibirNomeIdadeRetorno (30, "eric");
        retornarPalavraRetorno ("ole ole ola");
        retornaDobroRetorno (5);
        retornaNomeSobrenomeRetorno("Eric", "Nagao");
        retornaSalarioRetorno(3000);

    }
        
    public static String exibirNomeIdade (int idade, String nome) {
        return "nome "+nome +" - idade "+idade;
    }
    
    public static String retornarPalavra (String palavra) {
         return palavra;
    }

    public static int retornaDobro(int numero) {
        return numero*2;
    }

    public static String retornaNomeSobrenome(String nome, String sobrenome) {
        return "Nome2: "+nome+" " +sobrenome;
    }

    public static Double retornaSalario(double salario) {
        return salario;
    }

    public static void exibirNomeIdadeRetorno (int idade, String nome) {
        System.out.println( "Nome "+nome +" - idade "+idade);
    }
    
    public static void retornarPalavraRetorno (String palavra) {
         System.out.println(palavra) ;
    }

    public static void retornaDobroRetorno(int numero) {
        System.out.println(numero *2);
    }

    public static void retornaNomeSobrenomeRetorno(String nome, String sobrenome) {
        System.out.println( "Nome2: "+nome +" "+ sobrenome);
    }

    public static void retornaSalarioRetorno(double salario) {
        System.out.println(salario);
    }


}
