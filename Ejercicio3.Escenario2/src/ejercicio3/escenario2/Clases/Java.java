package Ejercicio3.Escenario2.Clases;

public class Java extends LenguajeProgramacion{
    
    public Java(){
        super("Java");
    }
    
    public double establecerBono(double dblSalarioMensual){
        double dblMontoExtra = (dblSalarioMensual*20)/100;
        return dblMontoExtra+dblSalarioMensual;
    }
}