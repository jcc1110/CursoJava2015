public class Bombero{
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private boolean especialista;

    public Bombero(String valorNombre, String valorApellidos, int valorEdad, boolean valorCasado, boolean valorEspecialista){
        nombre=valorNombre;
        apellidos=valorApellidos;
        edad=valorEdad;
        casado=valorCasado;
        especialista=valorEspecialista;
    }
    
    public void setNombre(String valorNombre){
        nombre=valorNombre;
    }
    
    public void setApellidos(String valorApellidos){
        apellidos=valorApellidos;
    }
    
    public void setEdad(int valorEdad){
        edad=valorEdad;
    }
    
    public void setCasado(boolean valorCasado){
        casado=valorCasado;
    }
    
    public void setEspecialista(boolean valorEspecialista){
        especialista=valorEspecialista;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public boolean getCasado(){
        return casado;
    }
    
    public boolean getEspecialista(){
        return especialista;
    }
    
        
}