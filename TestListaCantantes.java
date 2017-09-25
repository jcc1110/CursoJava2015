public class TestListaCantantes{
    
    
    
    public static void main(String args[]){
       ListaCantantesFamosos losCantantes = new ListaCantantesFamosos();
       System.out.println("Los cantantes registrados actualmente son:");
       losCantantes.getTodos();
       System.out.println("Por favor ingrese el nombre de un cantante famoso adicional");
       EntradaDeTexo cantante4 = new EntradaDeTexo();
       losCantantes.addCantante(cantante4.getEntrada());       
       System.out.println("Los cantantes registrados ahora son:");
       losCantantes.getTodos();
       EntradaDeTexo cantanteX;
       do{
                   System.out.println("Si desea ingrese el nombre de un cantante famoso adicional, introduzca 0 si ya no quiere introducir más");
                   cantanteX = new EntradaDeTexo();                   
                   if(!cantanteX.getEntrada().equals("0")){losCantantes.addCantante(cantanteX.getEntrada());
                       System.out.println("Los cantantes registrados ahora son:");
                       losCantantes.getTodos();}
       }while(!cantanteX.getEntrada().equals("0"));
       System.out.println("La totalidad de cantantes registrados es:");
       losCantantes.getTodos();
       System.out.println("Programa terminado - gracias por usarme!");
    }
    
}