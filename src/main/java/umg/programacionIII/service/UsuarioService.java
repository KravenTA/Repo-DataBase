package umg.programacionIII.service;

import org.springframework.stereotype.Service;
import umg.programacionIII.model.Usuario;
import umg.programacionIII.repository.UsuarioRepository;
import umg.programacionIII.estructuras.lista.Lista;

import java.util.Optional;

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

    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}