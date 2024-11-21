class Persona {
    String nombre;
    int edad;
}

public class EjemploReferenciaPersona {
    public static void main(String[] args) {
        // Creando un objeto Persona
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 25;

        // Creando otra referencia al mismo objeto
        Persona persona2 = persona1;

        // Modificando propiedades a través de persona2
        persona2.edad = 30;

        // Imprimiendo los datos desde ambas referencias
        System.out.println("Persona 1: " + persona1.nombre + ", " + persona1.edad);
        System.out.println("Persona 2: " + persona2.nombre + ", " + persona2.edad);
    }
}
