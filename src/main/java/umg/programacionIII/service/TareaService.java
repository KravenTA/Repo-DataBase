package umg.programacionIII.service;

import org.springframework.stereotype.Service;
import umg.programacionIII.model.Tarea;
import umg.programacionIII.repository.TareaRepository;
import umg.programacionIII.estructuras.lista.Lista;
import umg.programacionIII.estructuras.lista.Nodo;

import java.util.Optional;

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

    public Optional<Tarea> findById(Long id) {
        return tareaRepository.findById(id);
    }

    public Lista<Tarea> findByUsuarioId(Long usuarioId) {
        Lista<Tarea> resultado = new Lista<>();
        tareaRepository.findByUsuarioId(usuarioId).forEach(tarea -> resultado.insertarCabezaLista(tarea));
        return resultado;
    }

    public Lista<Tarea> findByFinalizada(boolean finalizada) {
        Lista<Tarea> resultado = new Lista<>();
        tareaRepository.findByFinalizada(finalizada).forEach(tarea -> resultado.insertarCabezaLista(tarea));
        return resultado;
    }

    public Tarea save(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public void deleteById(Long id) {
        tareaRepository.deleteById(id);
    }
}