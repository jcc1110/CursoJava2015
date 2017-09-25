import java.util.Scanner;
public class PorLetritas{
    public static void main(String[] args){
        String textoTeclado="";
        System.out.println("Por favor introduzca cualquier texto");
        Scanner entradaScanner;
        entradaScanner = new Scanner(System.in);
        textoTeclado=entradaScanner.nextLine();
        for(int i=0;i<textoTeclado.length();i++){
            System.out.println(textoTeclado.substring(i,i+1));
        }
    }
}