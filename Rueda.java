public class Rueda{
    private String tipo;
    private double grosor;
    private double diametro;
    private String marca;
    private String cadenaRetorno;
    
    public Rueda(){
        tipo="Desconocido";
        grosor=0.0;
        diametro=0.0;
        marca="Desconocida";
        cadenaRetorno="No hay retorno";
    }
    
    public void setTipo(String valorTipo){
        tipo=valorTipo;
    }
    
    public void setGrosor(double valorGrosor){
        grosor=valorGrosor;
    }
    
    public void setDiametro(double valorDiametro){
        diametro=valorDiametro;
    }
    
    public void setMarca(String valorMarca){
        marca=valorMarca;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void comprobarDimensiones(){
        if (diametro>1.4){
            System.out.println("La rueda es para un vehiculo grande");
            if(grosor<0.4){
                System.out.println("El grosor para esta rueda es inferior al recomendado");
            }
        }        
        else if (diametro <= 1.4 && diametro>0.8){
            System.out.println("La rueda es para un vehiculo mediano");
            if (grosor<0.25){
                System.out.println("El grosor para esta rueda es inferior al recomendado");
            }
        }
        else{
            System.out.println("La rueda es para un vehiculo pequeño");
        }

    }
            
    
    public double getGrosor(){
        return grosor;
    }
    
    public double getDiametro(){
        return diametro;
    }
    
    public String getMarca(){
        return marca;
    }
}
