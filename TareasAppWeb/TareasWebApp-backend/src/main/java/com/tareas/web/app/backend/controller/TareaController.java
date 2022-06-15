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

//Implementación del API con los métodos HTTP (GET, POST, PUT, DELETE) para la manipulación de datos según los principios de implementación REST
@RestController
@RequestMapping("/api/tareas")
public class TareaController {
	
	private TareaService tareaservice;
	
	public TareaController(TareaService tareaservice) {
		super();
		this.tareaservice = tareaservice;
	}
	
	//Lista de tareas con método GET
	@GetMapping
	public List<Tarea> getAllTareas(){
		return tareaservice.getAllTareas();
	}
	
	//Nueva tarea con método POST
	@PostMapping()
	public ResponseEntity<Tarea> createTarea(@RequestBody Tarea tarea) {
		return new ResponseEntity<Tarea>(tareaservice.saveTarea(tarea), HttpStatus.CREATED);
	}
	
	//Actualización de tarea con método PUT
	@PutMapping("{idtarea}")
	public ResponseEntity<Tarea> updateTarea(@PathVariable("idtarea") int idtarea, @RequestBody Tarea tarea){
		return new ResponseEntity<Tarea>(tareaservice.updateTarea(tarea, idtarea), HttpStatus.OK);
	}
	
	//Eliminación de tarea con método DELETE
	@DeleteMapping("{idtarea}")
	public ResponseEntity<String> deleteTarea(@PathVariable("idtarea") int idtarea){
		tareaservice.deleteTarea(idtarea);
		return new ResponseEntity<String>("Tarea eliminada.", HttpStatus.OK);
	}
}
