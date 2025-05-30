package umg.programacionIII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.programacionIII.model.Tarea;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByUsuarioId(Long usuarioId);
    List<Tarea> findByFinalizada(boolean finalizada);
}
