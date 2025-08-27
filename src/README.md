# Sistema de Biblioteca en Java

Este proyecto es una **prueba práctica de Programación Orientada a Objetos (POO) en Java**.  
Se modela un sistema sencillo para gestionar una biblioteca con **libros** y **revistas**, aplicando los conceptos de **herencia, polimorfismo, encapsulamiento y abstracción**.  

---

## Tecnologías utilizadas
- Java **17** (JDK 17)
- IntelliJ IDEA (IDE recomendado)
- POO (Programación Orientada a Objetos)

---

## Estructura del proyecto

```
src/
 └── biblioteca/
      ├── app/
      │    └── Main.java
      ├── modelo/
      │    ├── Recurso.java
      │    ├── Libro.java
      │    ├── Revista.java
      │    └── TipoRevista.java
      └── servicio/
           ├── IBiblioteca.java
           └── Biblioteca.java
```

---

## Clases principales

### `Recurso`
Clase base que representa cualquier recurso de la biblioteca.  
Atributos:
- `id` (int) → Identificador único  
- `titulo` (String) → Título del recurso  
- `disponible` (boolean) → Si el recurso está disponible o no  

---

### `Libro` (hereda de `Recurso`)
Atributo adicional:
- `autor` (String)  

---

### `Revista` (hereda de `Recurso`)
Atributos adicionales:
- `numero` (int)  
- `tipo` (TipoRevista) → Enumerado que define el tipo de revista  

Ejemplo de `TipoRevista`:
```java
public enum TipoRevista {
    CIENCIAS, MODA, TECNOLOGIA, DEPORTES, CULTURA
}
```

---

### `Biblioteca` (implementa `IBiblioteca`)
Funcionalidades:
- `agregarRecurso(Recurso r)` → Agrega un libro o revista a la biblioteca  
- `prestarRecurso(int id)` → Cambia el estado de disponibilidad de un recurso  
- `buscarRecursoPorTitulo(String titulo)` → Busca recursos por título  

---

## Ejemplo de uso

En la clase `Main.java` se prueba el sistema:  

```java
Biblioteca biblioteca = new Biblioteca();

Libro libro1 = new Libro(1, "El Quijote", true, "Miguel de Cervantes");
Revista revista1 = new Revista(2, "National Geographic", true, 120, TipoRevista.CIENCIAS);

biblioteca.agregarRecurso(libro1);
biblioteca.agregarRecurso(revista1);

System.out.println("📚 Recursos en la biblioteca:");
for (var recurso : biblioteca.getRecursos()) {
    System.out.println(recurso);
}

biblioteca.prestarRecurso(1); // Cambia disponibilidad del libro
```

---

## Conceptos de POO aplicados
- **Herencia** → `Libro` y `Revista` heredan de `Recurso`  
- **Polimorfismo** → La biblioteca maneja `Recursos` sin importar si son libros o revistas  
- **Encapsulamiento** → Atributos privados con getters/setters  
- **Abstracción** → Interfaz `IBiblioteca` define las operaciones principales  

---

## Cómo ejecutar el proyecto
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/biblioteca-java.git
   cd biblioteca-java
   ```
2. Abrir en **IntelliJ IDEA** o cualquier IDE de Java  
3. Asegurarse de tener **JDK 17 configurado**  
4. Ejecutar `Main.java`  

---

## 📖 Autor
- 👨‍💻 ****  
- 🌐 [LinkedIn](https://www.linkedin.com/in/san7imo)  
- 💻 [Portafolio](https://san7imo.dev/)  
