package com.tareas.web.app.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.web.app.backend.model.Tarea;
import com.tareas.web.app.backend.service.TareaService;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
	
	private TareaService tareaservice;
	
	public TareaController(TareaService tareaservice) {
		super();
		this.tareaservice = tareaservice;
	}

	@GetMapping
	public List<Tarea> getAllTareas(){
		return tareaservice.getAllTareas();
	}
	
	@PostMapping()
	public ResponseEntity<Tarea> createTarea(@RequestBody Tarea tarea) {
		return new ResponseEntity<Tarea>(tareaservice.saveTarea(tarea), HttpStatus.CREATED);
	}
	
	@PutMapping("{idtarea}")
	public ResponseEntity<Tarea> updateTarea(@PathVariable("idtarea") int idtarea, @RequestBody Tarea tarea){
		return new ResponseEntity<Tarea>(tareaservice.updateTarea(tarea, idtarea), HttpStatus.OK);
	}
	
	@DeleteMapping("{idtarea}")
	public ResponseEntity<String> deleteTarea(@PathVariable("idtarea") int idtarea){
		tareaservice.deleteTarea(idtarea);
		return new ResponseEntity<String>("Tarea eliminada.", HttpStatus.OK);
	}
}
