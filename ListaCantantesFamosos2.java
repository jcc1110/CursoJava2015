import java.util.ArrayList;

public class ListaCantantesFamosos2{
    
    private ArrayList<CantanteFamoso> listaCantantesFamosos;
    private String nombreLista;

    public ListaCantantesFamosos2(String valorNombre){
        listaCantantesFamosos = new ArrayList<CantanteFamoso>();
        nombreLista = valorNombre;
    }
    
    
    public void addCantanteFamoso(CantanteFamoso cantante){
        listaCantantesFamosos.add(cantante);
    }
}
