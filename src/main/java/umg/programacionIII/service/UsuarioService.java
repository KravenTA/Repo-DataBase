package umg.programacionIII.service;

import org.springframework.stereotype.Service;
import umg.programacionIII.model.Usuario;
import umg.programacionIII.repository.UsuarioRepository;
import umg.programacionIII.estructuras.lista.Lista;
import umg.programacionIII.estructuras.lista.Opcional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Lista<Usuario> findAll() {
        Lista<Usuario> resultado = new Lista<>();
        usuarioRepository.findAll().forEach(usuario -> resultado.insertarCabezaLista(usuario));
        return resultado;
    }

    public Opcional<Usuario> findById(Long id) {
        java.util.Optional<Usuario> resultado = usuarioRepository.findById(id);
        if (resultado.isPresent()) {
            return Opcional.de(resultado.get());
        } else {
            return Opcional.vacio();
        }
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}