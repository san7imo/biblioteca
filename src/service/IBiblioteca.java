package service;

import model.Recurso;
import java.util.List;

public interface IBiblioteca {
    void agregarRecurso(Recurso recurso);
    boolean prestarRecurso(int id);
    List<Recurso> buscarRecursoPorTitulo(String titulo);
    List<Recurso> getRecursos();
}
