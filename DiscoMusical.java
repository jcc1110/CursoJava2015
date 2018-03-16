public class DiscoMusical{
    private String titulo;
    private String autor;
    private int anoEdicion;
    private String formato;
    private boolean digital;
    private int numeroPistas;
    private float duracionPista;
    public DiscoMusical(){
        titulo="Desconocido";
        autor="Desconocido";
        formato="Desconocido";
        digital=false;
        numeroPistas=0;
        anoEdicion=0;
    }
    
    public void setTitulo(String valorTitulo){
        titulo=valorTitulo;
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
   
    public int pruebadem(int caca){
        int numero=caca*2;        
        return numero;
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
        numeroPistas=valorNumeroPista;
        duracionPista=valorDuracionPista;
    }
    
    public float getDuracionDisco(){
        return duracionPista;
    }
    
   
    public void addCancion(int tituloCancion, float duracionCancion){
    
    }
    
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
    
    
    
} 
    