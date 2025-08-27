package service;

import model.Recurso;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements IBiblioteca {
    private List<Recurso> recursos;

    // Constructor
    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    @Override
    public void agregarRecurso(Recurso recurso) {
        recursos.add(recurso);
    }

    @Override
    public boolean prestarRecurso(int id) {
        for (Recurso recurso : recursos) {
            if (recurso.getId() == id && recurso.isDisponible()) {
                recurso.setDisponible(false); // lo marcamos como prestado
                return true;
            }
        }
        return false; // no se encontró o ya está prestado
    }

    @Override
    public List<Recurso> buscarRecursoPorTitulo(String titulo) {
        List<Recurso> resultados = new ArrayList<>();
        for (Recurso recurso : recursos) {
            if (recurso.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(recurso);
            }
        }
        return resultados;
    }

    @Override
    public List<Recurso> getRecursos() {
        return recursos;
    }
}
