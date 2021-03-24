
public class Persona
{
    String nombre;
    int edad;
    
    public Persona(String nom, int e){
        nombre = nom;
        edad = e;
    }
    
    public String presentarse(){
        String saludo = "Hola mi nombre es " + nombre + " y mi edad es " + edad;
        return saludo;
    } 
    
    public int sumar(int num1, int num2){
        int suma;
        
        suma = num1 + num2;
        
        return suma;
    }
    
    public int decirEdad(){
        return edad;
    }
}
