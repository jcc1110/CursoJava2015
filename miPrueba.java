public class miPrueba{
    public String resultado(String dimeUnString){
        String nuevoDimeUnString;
        nuevoDimeUnString=dimeUnString;
        System.out.println("dimeUnString inicialmente vale " + dimeUnString);
        nuevoDimeUnString=dimeUnString+" recibido";
        System.out.println("dimeUnString ahora vale " + nuevoDimeUnString);
        return "El metodo devuelve " + nuevoDimeUnString;
    }
}
