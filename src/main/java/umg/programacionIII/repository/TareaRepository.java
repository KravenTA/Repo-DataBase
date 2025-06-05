package umg.programacionIII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.programacionIII.model.Tarea;
import umg.programacionIII.estructuras.lista.Lista;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    Lista<Tarea> findByUsuarioId(Long usuarioId);
    Lista<Tarea> findByFinalizada(boolean finalizada);
}