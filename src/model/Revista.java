package model;

public class Revista extends Recurso {
    private int numero;
    private TipoRevista tipo;

    // Constructor
    public Revista(int id, String titulo, boolean disponible, int numero, TipoRevista tipo) {
        super(id, titulo, disponible); // llama al constructor de Recurso
        this.numero = numero;
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoRevista getTipo() {
        return tipo;
    }

    public void setTipo(TipoRevista tipo) {
        this.tipo = tipo;
    }

    //toString
    @Override
    public String toString() {
        return "Revista{" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                ", disponible=" + isDisponible() +
                ", numero=" + numero +
                ", tipo=" + tipo +
                '}';
    }
}
