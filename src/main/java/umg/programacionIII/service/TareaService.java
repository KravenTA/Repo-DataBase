package umg.programacionIII.service;

import org.springframework.stereotype.Service;
import umg.programacionIII.model.Tarea;
import umg.programacionIII.repository.TareaRepository;
import umg.programacionIII.estructuras.lista.Lista;
import umg.programacionIII.estructuras.lista.Opcional;

@Service
public class TareaService {
    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public Lista<Tarea> findAll() {
        Lista<Tarea> resultado = new Lista<>();
        tareaRepository.findAll().forEach(tarea -> resultado.insertarCabezaLista(tarea));
        return resultado;
    }

    public Opcional<Tarea> findById(Long id) {
        java.util.Optional<Tarea> resultado = tareaRepository.findById(id);
        if (resultado.isPresent()) {
            return Opcional.de(resultado.get());
        } else {
            return Opcional.vacio();
        }
    }

    public Lista<Tarea> findByUsuarioId(Long usuarioId) {
        return tareaRepository.findByUsuarioId(usuarioId);
    }

    public Lista<Tarea> findByFinalizada(boolean finalizada) {
        return tareaRepository.findByFinalizada(finalizada);
    }

    public Tarea save(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public void deleteById(Long id) {
        tareaRepository.deleteById(id);
    }
}