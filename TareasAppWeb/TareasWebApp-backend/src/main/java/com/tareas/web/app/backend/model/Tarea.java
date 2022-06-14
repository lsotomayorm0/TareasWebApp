package com.tareas.web.app.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarea")
public class Tarea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtarea;
	
	@Column
	private String titulo;
	
	@Column
	private String descripcion;
	
	@Column
	private String fechacreacion;
	
	@Column
	private String fechaactualizacion;
	
	@Column
	private String fechaeliminacion;
	
	@Column
	private char estado;
	
	@Column
	private char eliminado;
	
	@Column
	private int secuencia;
	
	@Column
	private int subtarea;
	
	public Tarea() {
		
	}
	
	public Tarea(String titulo, String descripcion, String fechacreacion, String fechaactualizacion,
			String fechaeliminacion, char estado, char eliminado, int secuencia, int subtarea) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechacreacion = fechacreacion;
		this.fechaactualizacion = fechaactualizacion;
		this.fechaeliminacion = fechaeliminacion;
		this.estado = estado;
		this.eliminado = eliminado;
		this.secuencia = secuencia;
		this.subtarea = subtarea;
	}
	
	public int getIdtarea() {
		return idtarea;
	}
	public void setIdtarea(int idtarea) {
		this.idtarea = idtarea;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getFechaactualizacion() {
		return fechaactualizacion;
	}
	public void setFechaactualizacion(String fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}
	public String getFechaeliminacion() {
		return fechaeliminacion;
	}
	public void setFechaeliminacion(String fechaeliminacion) {
		this.fechaeliminacion = fechaeliminacion;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	public char getEliminado() {
		return eliminado;
	}
	public void setEliminado(char eliminado) {
		this.eliminado = eliminado;
	}
	public int getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
	}
	public int getSubtarea() {
		return subtarea;
	}
	public void setSubtarea(int subtarea) {
		this.subtarea = subtarea;
	}
	
	
	
}
