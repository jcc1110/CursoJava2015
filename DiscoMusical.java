public class DiscoMusical{
    private String titulo;
    private String autor;
    private int anoEdicion;
    private String formato;
    private boolean digital;
    private int numeroPistas;
    private float duracionPista;
    private int numeroPista;
    
    public DiscoMusical(){
        titulo="Desconocido";
        autor="Desconocido";
        anoEdicion=0;
        formato="Desconocido";
        digital=false;
        numeroPistas=0;
    }
    
    public void setTitulo(String valorTitulo){
        titulo=valorTitulo;
    }
    
    public void setAutor(String valorAutor){
        autor=valorAutor;
    }
    
    public void setAnoEdicion(int valorAnoEdicion){
        anoEdicion=valorAnoEdicion;
    }
    
    public void setFormato(String valorFormato){
        formato=valorFormato;
    }
    
    public void setDigital(boolean valorDigital){
        digital=valorDigital;
    }
   
    public void setNumeroPistas(int valorNumeroPistas){
        numeroPistas=valorNumeroPistas;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getAnoEdicion(){
        return anoEdicion;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public boolean getDigital(){
        return digital;
    }

    public int getNumeroPistas(){
        return numeroPistas;
    }
    
    public float getDuracionPista(int valorPista){
        return valorPista;
    }
    
    public void setDuracionPista(int valorNumeroPista, float valorDuracionPista)
    {
        numeroPista=valorNumeroPista;
        duracionPista=valorDuracionPista;
    }
    
    public float getDuracionDisco(){
        return duracionPista;
    }
    
   
    public void addCancion(int tituloCancion, float duracionCancion){
    
    }
    
    
    
} 
    