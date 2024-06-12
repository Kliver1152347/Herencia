
/**
 * Write a description of class Auxiliar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auxiliar extends Persona
{ private String cargo;
private double auxilioDeTransporte;
    
//constructor
public Auxiliar(String codigo, String cedula, String nombre, int edad, double salario, String cargo, double auxilioDeTransporte){
super(codigo, cedula, nombre, edad, salario);
 this.cargo=cargo;
 this.auxilioDeTransporte=auxilioDeTransporte;
}

public void calcularSalario(){


}
}
