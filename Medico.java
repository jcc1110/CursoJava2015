public class Medico{
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    private String especialidad;
    
    public Medico(){
        nombre="Desconocido";
        apellidos="Desconocidos";
        edad=0;
        casado=false;
        numeroDocumentoIdentidad="Desconocido";
        especialidad="Desconocida";
    }
    
    public void setNombre(String valorNombre)
    {
        nombre=valorNombre;
        System.out.println("Ha cambiado el nombre del medico a: " + getNombre() );
    }
    
    public void setApellidos(String valosApellidos){
        apellidos=valosApellidos;
        System.out.println("Han cambiado los apellidos del medico de nombre " + getNombre() + ". El nuevo apellido es: " + getApellidos());
    }
    
    public void setEdad(int valorEdad){
        edad=valorEdad;
        System.out.println("Ha cambiado la edad del medico de nombre " + getNombre() + ". La nueva edad es: " + getEdad());
    }
    
    public void setCasado(boolean valorCasado){
        casado=valorCasado;
        System.out.println("Ha cambiado el estado civil del medico de nombre " + getNombre() + ". El nuevo estado civil es: " + getCasado());
    }
    
    public void setNumeroDocumentoIdentidad(String valorDocumento){
        numeroDocumentoIdentidad=valorDocumento;
        System.out.println("Ha cambiado el número de documento del medico de nombre " + getNombre() + ". El nuevo número es: " + getNumeroDocumentoIdentidad());
    }
    
    public void setEspecialidad(String valorEspecialidad){
        especialidad=valorEspecialidad;
        System.out.println("Ha cambiado la especialidad del medico de nombre " + getNombre() + ". La nueva especialidad es: " + getEspecialidad());
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
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void calculoParaMultiploEdad(){
        int resto;
        int anosFaltantes;
        resto = getEdad()%5;
        anosFaltantes=5-resto;
        System.out.println("Falta " + anosFaltantes + " año(s) para que " + getNombre() + " tenga una edad multiplo de 5");
    }
    
    
}
    