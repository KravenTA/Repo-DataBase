package umg.programacionIII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.programacionIII.model.Historial;

import java.util.List;

public interface HistorialRepository extends JpaRepository<Historial, Long> {
    List<Historial> findByUsuarioId(Long usuarioId);
}
