package com.tareas.web.app.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.web.app.backend.model.Tarea;
import com.tareas.web.app.backend.repository.TareaRepository;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
	
	@Autowired
	private TareaRepository tarearepository;
	
	@GetMapping()
	public List<Tarea> getAllTareas(){
		return tarearepository.findAll();
	}
}
