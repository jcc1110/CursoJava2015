import java.util.Scanner;
public class PorLetritasWhile{
    public static void main(String[] args){
        Scanner textoScanner;
        System.out.println("Por favor introduce un texto:");
        textoScanner=new Scanner(System.in);
        String textoTeclado=textoScanner.nextLine();
        int longitud=textoTeclado.length();
        int posicionActual=0;
        while(posicionActual<longitud){
            System.out.println("Letra " + (posicionActual+1) + ": " + textoTeclado.substring(posicionActual,posicionActual+1));
            posicionActual+=1;
        }
    }
}