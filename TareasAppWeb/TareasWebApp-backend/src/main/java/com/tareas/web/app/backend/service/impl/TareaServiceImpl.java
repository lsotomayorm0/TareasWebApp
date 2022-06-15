package com.tareas.web.app.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tareas.web.app.backend.exception.ResourceNotFoundException;
import com.tareas.web.app.backend.model.Tarea;
import com.tareas.web.app.backend.repository.TareaRepository;
import com.tareas.web.app.backend.service.TareaService;

@Service
public class TareaServiceImpl implements TareaService{
	
	private TareaRepository tarearepository;
	
	public TareaServiceImpl(TareaRepository tarearepository) {
		super();
		this.tarearepository = tarearepository;
	}

	@Override
	public Tarea saveTarea(Tarea tarea) {
		return tarearepository.save(tarea);
	}

	@Override
	public List<Tarea> getAllTareas() {
		return tarearepository.findAll();
	}

	@Override
	public Tarea updateTarea(Tarea tarea, int idtarea) {
		Tarea existingtarea = tarearepository.findById(idtarea).orElseThrow(() -> new ResourceNotFoundException("Employee", "idtarea", idtarea));
		
		existingtarea.setTitulo(tarea.getTitulo());
		existingtarea.setEstado(tarea.getEstado());
		
		tarearepository.save(existingtarea);
		return existingtarea;
	}

	@Override
	public void deleteTarea(int idtarea) {
		tarearepository.findById(idtarea).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", idtarea));
		tarearepository.deleteById(idtarea);
	}

}
