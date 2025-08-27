package model;

public class Libro extends Recurso {
    private String autor;

    // Constructor
    public Libro(int id, String titulo, boolean disponible, String autor) {
        super(id, titulo, disponible); // llama al constructor de Recurso
        this.autor = autor;
    }

    // Getter y Setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Sobrescribir toString para mostrar información del libro
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                ", disponible=" + isDisponible() +
                ", autor='" + autor + '\'' +
                '}';
    }
}
