public class Taxi {
    private String ciudad;
    private String matricula;
    private String distrito;
    private int tipoMotor; //0= desconocido, 1=gasolina, 2=diesel
    
    public Taxi(String valorMatricula, String valorDistrito, int valorTipoMotor ){
        ciudad="La Paz";
        matricula=valorMatricula;
        distrito=valorDistrito;
        tipoMotor=valorTipoMotor;
    }// cierra el constructor
    
    public Taxi(){
        ciudad="La Paz";
        matricula="Desconocida";
        distrito="Desconocido";
        tipoMotor=0;
    }
    
    public void setMatricula(String valorMatricula){
        matricula=valorMatricula;
    }
    
    public void setDistrito(String valorDistrito){
        distrito= "Distrito " + valorDistrito;
    }
    
    public void setTipoMotor(int valorTipoMotor){
        tipoMotor=valorTipoMotor;
    }
    
    public String getMatricula(){ return matricula;}
    public String getDistrito(){return distrito;}
    public int getTipoMotor(){return tipoMotor;}
}