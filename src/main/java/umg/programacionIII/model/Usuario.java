package umg.programacionIII.model;

import jakarta.persistence.*;
import umg.programacionIII.estructuras.lista.Lista;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Transient // No se persistirá directamente con JPA
    @JsonIgnore
    private Lista<Tarea> tareas;

    // Constructor que inicializa la lista
    public Usuario() {
        this.tareas = new Lista<>();
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(Lista<Tarea> tareas) {
        this.tareas = tareas;
    }
}
