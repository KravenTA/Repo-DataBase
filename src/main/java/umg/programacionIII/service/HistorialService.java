package umg.programacionIII.service;

import org.springframework.stereotype.Service;
import umg.programacionIII.model.Historial;
import umg.programacionIII.repository.HistorialRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialService {
    private final HistorialRepository historialRepository;

    public HistorialService(HistorialRepository historialRepository) {
        this.historialRepository = historialRepository;
    }

    public List<Historial> findAll() {
        return historialRepository.findAll();
    }

    public Optional<Historial> findById(Long id) {
        return historialRepository.findById(id);
    }

    public List<Historial> findByUsuarioId(Long usuarioId) {
        return historialRepository.findByUsuarioId(usuarioId);
    }

    public Historial save(Historial historial) {
        return historialRepository.save(historial);
    }

    public void deleteById(Long id) {
        historialRepository.deleteById(id);
    }
}