public class CantanteFamoso
{
    private String nombre;
    private String discoConMasVentas;
    
    public CantanteFamoso(String valorNombre, String valorDisco){
        nombre=valorNombre;
        discoConMasVentas=valorDisco;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setDiscoConMasVentas(String disco){
        this.discoConMasVentas=disco;
    }
    
    public String getDiscoConMasVentas(){
        return discoConMasVentas;
    }
    
}
