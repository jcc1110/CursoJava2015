public class Casa{
    private double superficie;
    private String direccion;
    private SalonCasa salon;
    private CocinaCasa cocina;
    
    public Casa(){
        superficie=0.0;
        direccion="Desconocida";
        salon = new SalonCasa();
        cocina = new CocinaCasa();
        
    }
    
    public Casa(double valorSuperficie, String valorDireccion, SalonCasa objetoSalon, CocinaCasa objetoCocina){
        superficie=valorSuperficie;
        direccion=valorDireccion;
        salon = new SalonCasa();
        cocina= new CocinaCasa();
        
    }
}