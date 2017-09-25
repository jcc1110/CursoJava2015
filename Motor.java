public class Motor{
    private int tipoBomba;
    private String tipoFluido;
    private String combustible;
    
    public Motor(){
        tipoBomba=0;
        tipoFluido="Desconocido";
        combustible="Desconocido";
    }
    
    public void setTipoBomba(int valorTipoBomba){
        tipoBomba=valorTipoBomba;
    }
    
    public void setTipoFluido(String valorTipoFluido){
        tipoFluido=valorTipoFluido;
    }
    
    public void setCombustible(String valorCombustible){
        combustible=valorCombustible;
    }
    
    public int getTipoBomba(){
        return tipoBomba;
    }
    
    public String getTipoFluido(){
        return tipoFluido;
    }
    
    public String getCombustible(){
        return combustible;
    }
        
    public void dimeTipoMotor(){
        switch(tipoBomba){
            case 0:
            System.out.println("No hay establecido un valor definido para el tipo de bomba");
            break;
            case 1:
            System.out.println("La bomba es una bomba de agua");
            break;
            case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3:
            System.out.println("La bomba es una bomba de hormigón");
            break;
            case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default:
            System.out.println("No existe un valor válido para el tipo de bomba");
            break;
        }
    }
    
    public boolean dimeSiMotorEsParaAgua(){
        boolean motorEsParaAgua;
        motorEsParaAgua=false;
        if (tipoBomba==1){
            motorEsParaAgua=true;
        }
        return motorEsParaAgua;
    }
}