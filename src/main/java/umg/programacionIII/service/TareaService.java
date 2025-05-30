package umg.programacionIII.service;

import org.springframework.stereotype.Service;
import umg.programacionIII.model.Tarea;
import umg.programacionIII.repository.TareaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {
    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> findAll() {
        return tareaRepository.findAll();
    }

    public Optional<Tarea> findById(Long id) {
        return tareaRepository.findById(id);
    }

    public List<Tarea> findByUsuarioId(Long usuarioId) {
        return tareaRepository.findByUsuarioId(usuarioId);
    }

    public List<Tarea> findByFinalizada(boolean finalizada) {
        return tareaRepository.findByFinalizada(finalizada);
    }

    public Tarea save(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public void deleteById(Long id) {
        tareaRepository.deleteById(id);
    }
}
