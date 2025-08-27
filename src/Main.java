
import model.Recurso;
import model.Revista;
import model.TipoRevista;
import service.Biblioteca;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Recurso libro1 = new Recurso(1, "El Quijote", true);
        Recurso libro2 = new Recurso(2, "Cien Años de Soledad", true);

        // Crear algunas revistas
        Revista revista1 = new Revista(3, "National Geographic", true, 120, TipoRevista.CIENTIFICA);
        Revista revista2 = new Revista(4, "Vogue", true, 58, TipoRevista.MODA);

        // Agregar recursos a la biblioteca
        biblioteca.agregarRecurso(libro1);
        biblioteca.agregarRecurso(libro2);
        biblioteca.agregarRecurso(revista1);
        biblioteca.agregarRecurso(revista2);

        // Mostrar todos los recursos
        System.out.println("📚 Recursos en la biblioteca:");
        for (var recurso : biblioteca.getRecursos()) {
            System.out.println(recurso);
        }

        // Prestar un recurso
        System.out.println("\n🔑 Prestando recurso con ID 2...");
        boolean prestado = biblioteca.prestarRecurso(2);
        System.out.println("¿Se pudo prestar? " + prestado);

        // Buscar por título
        System.out.println("\n🔎 Buscando recurso con título 'Vogue'...");
        var resultados = biblioteca.buscarRecursoPorTitulo("Vogue");
        for (var recurso : resultados) {
            System.out.println(recurso);
        }

        // Intentar prestar el mismo recurso otra vez
        System.out.println("\n🔑 Intentando prestar el mismo recurso (ID 2)...");
        boolean prestadoOtraVez = biblioteca.prestarRecurso(2);
        System.out.println("¿Se pudo prestar de nuevo? " + prestadoOtraVez);
    }
}
