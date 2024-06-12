
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{ String codigo;
    String cedula;
    String nombre;
    int edad;
    double salario;
    private Fecha fechaActual;
    private Fecha fechaIngreso;
    
    //constructor
   public Persona (String codigo, String cedula, String nombre, int edad, double salario){
this.codigo=codigo;
this.cedula=cedula;
this.nombre=nombre;
this.edad=edad;
this.salario=salario;
}
public String getCodigo(){
return codigo;}

public String getCedula(){
return cedula;}

public String getNombre(){
return nombre;}

public int getEdad(){
return edad;}

public double getSalario(){
return salario;}

public Fecha getFechaActual(){
return fechaActual;}

public Fecha getFechaIngreso(){
return fechaIngreso;}

public void setCodigo(String codigo){
this.codigo= codigo;}

public void setCedula(String cedula){
this.cedula=cedula;}

public void setNombre(String nombre){
this.nombre=nombre;}

public void setEdad(int edad){
this.edad=edad;}

public void setSalario(double salario){
this.salario=salario;}

public void imprimirInformacion(){
System.out.println("Nombre"+ nombre);
System.out.println("Edad"+edad);
System.out.println("Codigo"+ codigo);
System.out.println("Cedula"+cedula);

}
}