class Auto {
    String marca;
    int modelo;
}

public class EjemploReferencia {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.marca = "Toyota";
        auto1.modelo = 2023;

        // Creando otra referencia al mismo objeto
        Auto auto2 = auto1;

        // Modificando una propiedad a través de auto2
        auto2.modelo = 2024;

        System.out.println("Auto 1: " + auto1.marca + ", " + auto1.modelo);
        System.out.println("Auto 2: " + auto2.marca + ", " + auto2.modelo);
    }
}