public class TaxiCond{
    private Taxi vehiculoTaxi;
    private Persona conductorTaxi;
    
    public TaxiCond(Taxi objetoTaxi, Persona objetoPersona){
        vehiculoTaxi=new Taxi(objetoTaxi.getMatricula(), objetoTaxi.getDistrito(), objetoTaxi.getTipoMotor());
        conductorTaxi=new Persona(objetoPersona.getNombre());
    }
    
    public void setMatricula(String valorMatricula){
        vehiculoTaxi.setMatricula(valorMatricula);
    }
    
    public String getDatosTaxiCond(){
        String matricula=vehiculoTaxi.getMatricula();
        String distrito=vehiculoTaxi.getDistrito();
        int tipoMotor=vehiculoTaxi.getTipoMotor();
        String cadenaTipoMotor="";
        if (tipoMotor==0){cadenaTipoMotor="Desconocido";}
        else if(tipoMotor==1){cadenaTipoMotor="Gasolina";}
        else if(tipoMotor==2){cadenaTipoMotor="Diesel";}
        String datosTaxiCond = "El objeto TaxiCond presenta estos datos. Matricula: " + matricula + " Distrito: " + distrito + " Tipo de motor: " + cadenaTipoMotor;
        System.out.println(datosTaxiCond);
        return datosTaxiCond;
    }
}