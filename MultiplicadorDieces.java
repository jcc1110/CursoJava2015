public class MultiplicadorDieces{
    public MultiplicadorDieces(){
    }
    
    public double multiplicarPorDieces(double numero1, int numero2){
        Exponenciador exponenciado;
        exponenciado=new Exponenciador();
        return numero1*exponenciado.potenciaConRecursion(10,numero2);
    }
    
    
}