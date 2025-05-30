package umg.programacionIII.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private LocalDate fechaCreacion;
    private LocalDate fechaLimite;
    private boolean finalizada;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}

