public class Profesor{
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private boolean especialista;
    
    public Profesor(String nombre, String apellidos, int edad, boolean casado, boolean especialista){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.casado=casado;
        this.especialista=especialista;
    }
    
    public Profesor(){
        nombre="Desconocido";
        apellidos="Desconocidos";
        edad=0;
        casado=false;
        especialista=false;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setCasado(boolean casado){
        this.casado=casado;
    }
    
    public void setEspecialista(boolean especialista){
        this.especialista=especialista;
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