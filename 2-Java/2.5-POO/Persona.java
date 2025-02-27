public class Persona {

    public static void main(String[] args) {
        Persona personaSinParametros = new Persona();
        Persona personaConNombreApellidoDni = new Persona("Carlos", 10, "22330000");
        Persona personaConTodosLosParametros = new Persona("Carlos", 10, "22330000", 80, 180);
        // Persona personaConNombreEdad = new Persona("Carlos", 50);
    }

    String nombre;
    Integer edad;
    String dni;
    Integer peso;
    Integer altura;

    public Persona(){}

    public Persona(String nombre, Integer edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, Integer edad, String dni, Integer peso, Integer altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    // peso/(altura^2) - (peso expresado en kg y altura en mts)    
}
