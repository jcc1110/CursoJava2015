import java.util.Scanner;
public class EntradaCondicional{
    public static void main(String[] args){
        String textoTeclado="";
        int longitudTexto=0;
        
        System.out.println("Por favor introduzca una cadena de texto por el teclado");
        Scanner textoScanner = new Scanner(System.in);        
        textoTeclado=textoScanner.nextLine();
        longitudTexto=textoTeclado.length();
        
        if(longitudTexto<5){
            System.out.println("El texto tiene menos de 5 caracteres");
        }
        else if(longitudTexto>=5 && longitudTexto<=15){
            System.out.println("El texto tiene entre 5 y 15 caracteres");
        }
        else{
            System.out.println("El texto tiene más de 15 caracteres");
        }
        
        if (textoTeclado.startsWith("a")){
            System.out.println("El texto introducido comienza por la letra a");
        }
        else{
            System.out.println("El texto introducido No comienza por la letra a");
        }        
    }
}