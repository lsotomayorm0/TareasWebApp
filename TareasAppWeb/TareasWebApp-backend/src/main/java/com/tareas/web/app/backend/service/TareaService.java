package com.tareas.web.app.backend.service;

import java.util.List;

import com.tareas.web.app.backend.model.Tarea;

public interface TareaService {
	
	Tarea saveTarea(Tarea tarea);
	List<Tarea> getAllTareas();
	Tarea updateTarea(Tarea tarea, int idtarea);
	void deleteTarea(int idtarea);
}
