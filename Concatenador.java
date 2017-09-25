public class Concatenador{
    public Concatenador(){
    }
    
    public String generaCodigo(String cadena1, String cadena2, String cadena3){
        String codigoGenerado;
        codigoGenerado=cadena1.substring(0,2) + " " +cadena2.substring(0,4) + "-" + cadena3.substring(0,6);
        return codigoGenerado;
    }
}