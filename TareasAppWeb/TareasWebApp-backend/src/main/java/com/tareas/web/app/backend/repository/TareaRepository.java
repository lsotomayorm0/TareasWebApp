package com.tareas.web.app.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tareas.web.app.backend.model.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer>{

}
