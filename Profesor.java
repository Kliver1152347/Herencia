
/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Persona
{
    private String especialidad; 
    private int horasSemanales;
    private double salario;
    private double valorHora;
    //constructor
    public Profesor (String codigo, String especialidad, String cedula, String nombre, int edad,int horasSemanales, double salario, double valorHora){
 super(codigo,cedula,nombre,edad,salario);
this.especialidad=especialidad;
this.horasSemanales=horasSemanales;
this.salario=salario;
this.valorHora=valorHora;
 }
public String getEspecialidad(){
return especialidad;}

public int getHorasSemanales(){
return horasSemanales;}

public double getValorHora(){
return valorHora;}

public double getSalario(){
return salario;
}

public void setEspecialidad(String especialidad){
this.especialidad=especialidad;}

public void setHorasSemanales(int horasSemanales){
this.horasSemanales=horasSemanales;}

public void setSalario(double salario){
this.salario=salario;}

public void setValorHora(double valorHora){
this.valorHora=valorHora;}

public void calcularSalario(){}




}