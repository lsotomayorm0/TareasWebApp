package com.tareas.web.app.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tareas.web.app.backend.model.Tarea;

//Configuración del controlador para la conexión con a base da datos empleando JPA con MySQL y dialect InnoMysql5
@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer>{

}
