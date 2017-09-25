public class TestDelDoWhile{
    public static void main(String[] args){
        int contador=0;
        do{
            System.out.println("Contador... " + (contador+1));
            contador+=1;
        }while (contador<10);        
    }
}