import java.util.Iterator;

public class TestCantantesFamosos
{
    public static void main(String[] args){
        ListaCantantesFamosos2 listaCantantes=new ListaCantantesFamosos2("Lista de cantantes");
        CantanteFamoso cantante = new CantanteFamoso("uno","disco1");
        listaCantantes.addCantanteFamoso(cantante);
        cantante.setNombre("dos");
        cantante.setDiscoConMasVentas("disco2");
        listaCantantes.addCantanteFamoso(cantante);
        Iterator<CantanteFamoso> it = listaCantantes.iterator();
    }
    
}
