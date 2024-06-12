
/**
 * Write a description of class Administrativo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrativo extends Persona
{
    String cargo;
    int añosExperiencia;
    String numeroExtensionTelefonica;
    double comision;
    
    public Administrativo(String codigo, String cedula, String nombre, int edad, String cargo
    , int añosExperiencia, String numeroExtensionTelefonica, double salario,double comision){
    super(codigo, cedula, nombre, edad, salario);
    this.cargo=cargo;
    this.añosExperiencia=añosExperiencia;
    this.numeroExtensionTelefonica=numeroExtensionTelefonica;
    this.comision=comision;
   
    
    }
   public String getCargo(){
       
    return cargo;}
    
    public int getAñosExperiencia(){
    return añosExperiencia;}
    
    public String getNumeroExtensionTelefonica(){
    return numeroExtensionTelefonica;}
    public double getComision(){
    return comision;}
    
    public void setCargo(String cargo){
    this.cargo=cargo;}
    
    public void setComision(double comision){
    this.comision=comision;
    }
    
    public void setAñosExperiencia(int añosExperiencia){
    this.añosExperiencia=añosExperiencia;}
    
    public void setNumeroExtensionTelefonica(String numeroExtensionTelefonica){
    this.numeroExtensionTelefonica=numeroExtensionTelefonica;}
    
    public void imprimirInformacion(){
    System.out.println("Cargo:"+ cargo);
    System.out.println("Años de experiencia:"+ añosExperiencia);
    System.out.println("Numero de extension telefonica: "+ numeroExtensionTelefonica);
}

public void calcularSalario(){
}
}
