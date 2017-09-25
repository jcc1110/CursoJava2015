import java.util.*;

public class TestListaNombres{
    public static void main(){
        System.out.println("Empecemos el programa");
        System.out.println("Por favor introduzca nombre 1:");
        EntradaDeTexo entrada1 = new EntradaDeTexo();
        System.out.println("Por favor introduzca nombre 2:");
        EntradaDeTexo entrada2 = new EntradaDeTexo();
        System.out.println("Por favor introduzca nombre 3:");
        EntradaDeTexo entrada3 = new EntradaDeTexo();
        System.out.println("Gracias");
        ListaNombres lista1 = new ListaNombres("Nombres introducidos por el usuario");
        lista1.addNombre(entrada1.getEntrada());
        lista1.addNombre(entrada2.getEntrada());
        lista1.addNombre(entrada3.getEntrada());
        System.out.println("La lista ha quedado formada por " + lista1.getTamaño() + " elementos");
        System.out.println("Elemento 1: " + lista1.getNombre(0));
        System.out.println("Elemento 2: " + lista1.getNombre(1));
        System.out.println("Elemento 3: " + lista1.getNombre(2));
    }
}