public class Persona{
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    
    public Persona(){
        nombre="Desconocido";
        apellidos="Desconocidos";
        edad=0;
        casado=false;
        numeroDocumentoIdentidad="Desconocido";
    }
    
    public Persona(String valorNombre){
        nombre=valorNombre;
        apellidos="Desconocidos";
        edad=0;
        casado=false;
        numeroDocumentoIdentidad="Desconocido";
    }
    
    public void setNombre(String valorNombre){
        nombre = valorNombre;
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
    
    public void setNumeroDocumentoIdentidad(String valorNumeroDocumentoIdentidad){
        numeroDocumentoIdentidad=valorNumeroDocumentoIdentidad;
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
    
    public String getNumeroDocumentoIdentidad(){
        return numeroDocumentoIdentidad;
    }
}