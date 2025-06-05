package umg.programacionIII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.programacionIII.model.Historial;
import umg.programacionIII.estructuras.lista.Lista;

public interface HistorialRepository extends JpaRepository<Historial, Long> {
    Lista<Historial> findByUsuarioId(Long usuarioId);
}