package umg.programacionIII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.programacionIII.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

