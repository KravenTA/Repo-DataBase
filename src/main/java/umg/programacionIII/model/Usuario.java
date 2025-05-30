package umg.programacionIII.model;

import jakarta.persistence.*;
import java.util.List;
import umg.programacionIII.estructuras.lista.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "usuario")
    private List<Tarea> tareas;
}

