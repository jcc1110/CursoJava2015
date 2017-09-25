public class Combinador{
    private String texto1;
    private String texto2;

    public Combinador(){
        texto1="";
        texto2="";
    }

    String combinacion(String valor_texto1, String valor_texto2){
        if (valor_texto1.length()<3 || valor_texto2.length()<3){
            return "No aporta cadenas validas";}
        else{
            String combinacion= valor_texto1.substring(0,3) + " " + valor_texto2.substring(0,3);
            System.out.println(combinacion);
            return combinacion;
        }
    }
}