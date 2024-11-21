import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    public static void main(String[] args) {
        // Crear una lista de tareas
        List<String> tareas = new ArrayList<>();

        // Agregar tareas a la lista
        tareas.add("Comprar víveres");
        tareas.add("Lavar el auto");
        tareas.add("Estudiar programación");

        // Imprimir la lista de tareas
        System.out.println("Tareas pendientes: " + tareas);

        // Completar una tarea (eliminar de la lista)
        tareas.remove("Lavar el auto");

        // Imprimir la lista actualizada de tareas
        System.out.println("Tareas pendientes después de completar: " + tareas);

        // Agregar otra tarea
        tareas.add("Hacer ejercicio");

        // Imprimir la lista actualizada de tareas
        System.out.println("Tareas pendientes después de agregar: " + tareas);
    }
}

}