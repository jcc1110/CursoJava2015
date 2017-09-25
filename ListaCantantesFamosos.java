import java.util.ArrayList;

public class ListaCantantesFamosos{
    
    private ArrayList<String> nombresCantantes = new ArrayList<String>();
    
    public ListaCantantesFamosos(){
        nombresCantantes.add("Cantante 1");
        nombresCantantes.add("Cantante 2");
        nombresCantantes.add("Cantante 3");
        
    }
    
    public void addCantante(String nombre){
        nombresCantantes.add(nombre);
    }
    
    public String getCantante(int posicion){
        if(posicion>=0 && posicion<=nombresCantantes.size()){return nombresCantantes.get(posicion);}
        else{return "No existe nombre en la posicion solicitada";}
    }
    
    public int getSize(){
        return nombresCantantes.size();
    }
    
    public void getTodos(){
        for(String nombre:nombresCantantes){
            System.out.println(nombre);
        }
    }
        
}
    
    
