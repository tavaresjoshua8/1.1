import java.util.Scanner;

import util.Libro;
import util.PilaLibros;

public class App {
    private final static Scanner input = new Scanner(System.in);
    private static PilaLibros pilaLibros;
    
    public static void main(String[] args) throws Exception {
        System.out.println("======== Bienvenido al programa de gestión de libros ========");
        System.out.println("Para salir, escribe 'salir'");
        System.out.println("Para ver el tope, escribe 'ver'");
        System.out.println("Para añadir un libro, escribe 'agregar'");
        System.out.println("Para eliminar un libro, escribe 'eliminar'");


        System.out.print("\nIngrese el tope de libros que desea ingresar \n> ");
        int cantidad = input.nextInt();
        input.nextLine();
        pilaLibros = new PilaLibros(cantidad);
        
        String opcion = "";
        do {
            System.out.print("\n> ");
            opcion = input.nextLine();
            switch (opcion) {
                case "salir":
                    System.out.println("Adiós");
                    break;
                case "ver":
                    System.out.println(pilaLibros.PilaVacia() ? "La pila está vacía" : pilaLibros.elementoArriba());
                    break;
                case "agregar":
                    pilaLibros.push(nuevoLibro());
                    break;
                case "eliminar":
                    System.out.println(pilaLibros.PilaVacia() ? "La pila está vacía" : "El libro eliminado es: " + pilaLibros.pop().getTitulo());
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!opcion.equals("salir"));
    }

    public static Libro nuevoLibro() {
        System.out.print("Título: ");
        String titulo = input.nextLine();
        System.out.print("Autor: ");
        String autor = input.nextLine();
        System.out.print("No. Páginas: ");
        int noPaginas = input.nextInt();
        input.nextLine();
        System.out.print("Editorial: ");
        String editorial = input.nextLine();
        System.out.print("ISBN: ");
        long isbn = input.nextLong();
        input.nextLine();

        return new Libro(titulo, autor, noPaginas, editorial, isbn);
    }
}
