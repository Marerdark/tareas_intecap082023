public class Persona {

    int edad;
    String nombre;
    String colorPiel;
    float estatura;
    
    public void saltar(){
        System.out.println("La persona salta");
    }
    
    public int calcularEdad(int anioNacimiento){
        return 2023 - anioNacimiento;
    }
    
    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
    
    public static void main(String[] args){
        Persona obj1 = new Persona();
        obj1.saltar();
        Persona.saludar("Pablo");
    }
}

