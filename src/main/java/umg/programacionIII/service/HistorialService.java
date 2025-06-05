package umg.programacionIII.service;

import org.springframework.stereotype.Service;
import umg.programacionIII.model.Historial;
import umg.programacionIII.repository.HistorialRepository;
import umg.programacionIII.estructuras.lista.Lista;
import umg.programacionIII.estructuras.lista.Opcional;

@Service
public class HistorialService {
    private final HistorialRepository historialRepository;

    public HistorialService(HistorialRepository historialRepository) {
        this.historialRepository = historialRepository;
    }

    public Lista<Historial> findAll() {
        Lista<Historial> resultado = new Lista<>();
        historialRepository.findAll().forEach(historial -> resultado.insertarCabezaLista(historial));
        return resultado;
    }

    public Opcional<Historial> findById(Long id) {
        java.util.Optional<Historial> resultado = historialRepository.findById(id);
        if (resultado.isPresent()) {
            return Opcional.de(resultado.get());
        } else {
            return Opcional.vacio();
        }
    }

    public Lista<Historial> findByUsuarioId(Long usuarioId) {
        return historialRepository.findByUsuarioId(usuarioId);
    }

    public Historial save(Historial historial) {
        return historialRepository.save(historial);
    }

    public void deleteById(Long id) {
        historialRepository.deleteById(id);
    }
}