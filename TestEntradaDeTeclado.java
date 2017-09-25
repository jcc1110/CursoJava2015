public class TestEntradaDeTeclado{
    
    public static void main(String[] args){
        System.out.println("Empezamos el programa");
        System.out.println("Por favor introduzca la entrada 1:");
        EntradaDeTexo entrada1 = new EntradaDeTexo();
        System.out.println("Por favor introduzca la entrada 2:");
        EntradaDeTexo entrada2 = new EntradaDeTexo();
        System.out.println("Por favor introduzca la entrada 3:");
        EntradaDeTexo entrada3 = new EntradaDeTexo();
        System.out.println("Gracias");
        System.out.println("La entrada 1 ha sido " + entrada1.getEntrada() + " y consta de " + entrada1.getLongitud() + " caracteres");
        System.out.println("La entrada 2 ha sido " + entrada2.getEntrada() + " y consta de " + entrada2.getLongitud() + " caracteres");
        System.out.println("La entrada 3 ha sido " + entrada3.getEntrada() + " y consta de " + entrada3.getLongitud() + " caracteres");
        System.out.println("La primera palabra de la entrada 1 es " + entrada1.getPrimeraPalabra());
        System.out.println("La primera palabra de la entrada 2 es " + entrada2.getPrimeraPalabra());
        System.out.println("La primera palabra de la entrada 3 es " + entrada3.getPrimeraPalabra()); 
        System.out.println("La primera entrada capitalizada es " + entrada1.getTextoCapitalizado());
        System.out.println("La segunda entrada capitalizada es " + entrada2.getTextoCapitalizado());
        System.out.println("La tercera entrada capitalizada es " + entrada3.getTextoCapitalizado()); 
        System.out.println("La segunda entrada mayusculizada es " + entrada2.getTextoMayusculas());
        comparaCadenasLetraALetra(entrada1.getEntrada(),entrada2.getEntrada());
    }
    
    public static void comparaCadenasLetraALetra(String cadena1, String cadena2){
        if(!cadena1.equals("") && !cadena2.equals("")){                     
            int long1=cadena1.length();
            int long2=cadena2.length();
            int tope=long1;
            if (tope<long2){
                tope=long2;
                         }
            
            for (int i=0;i<tope;i++){
                if (i<long1 && i<long2){
                    System.out.println("Letra " + (i+1) + " igual en las dos palabras? --> " + cadena1.substring(i,i+1).equals(cadena2.substring(i,i+1)));
                } else if(tope>long1){
                    System.out.println("La palabra 1 no tiene letra " + (i+1));
                } else if(tope>long2){
                    System.out.println("La palabra 2 no tiene letra " + (i+1));
                }               
            }
        }else{
            System.out.println("Alguna de las cadenas a comparar es nula");
        }
        
        
       
    }
}