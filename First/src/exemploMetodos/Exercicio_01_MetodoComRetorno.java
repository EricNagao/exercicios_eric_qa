package exemploMetodos;

public class Exercicio_01_MetodoComRetorno {
    
    public static String primeirometodo() {
    String  mensagem="primeirometodo";
    return mensagem;        
    }

    public static int segundometodo() {
        return 2;
    }
    
    public static double terceirometodo() {
        return 3.0;
    }
    
    public static boolean quartometodo() {
        return true;
    }

    public static String quintometodo() {
        return "quintometodo";
    }
    
    
    public static void main(String[] args) {
        
       System.out.println(primeirometodo());
       System.out.println(segundometodo());
       System.out.println(terceirometodo());
       System.out.println( quartometodo());
       System.out.println( quintometodo());
    }
    

}
