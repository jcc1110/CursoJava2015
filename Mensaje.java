public class Mensaje{
    private String remitente;
    private String para;
    private String texto;
    
    public Mensaje(String remitente, String para, String texto){
        this.remitente=remitente;
        this.para=para;
        this.texto = texto;
    }
    
    public void setRemitente(String remitente){
        this.remitente=remitente;
    }
    
    public String extraerFraccionTexto(){
        String texto="";
        texto=this.texto.substring(0,5);
        return texto;        
    }
}