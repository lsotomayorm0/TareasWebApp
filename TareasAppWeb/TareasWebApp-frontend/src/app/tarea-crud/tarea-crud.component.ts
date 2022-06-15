import { Component, OnInit } from '@angular/core';
import { Tarea } from '../tarea';
import { TareaService } from '../tarea.service';

@Component({
  selector: 'app-tarea-crud',
  templateUrl: './tarea-crud.component.html',
  styleUrls: ['./tarea-crud.component.css']
})
export class TareaCrudComponent implements OnInit {

  tareas:Tarea[] = [];

  constructor(private tareaService:TareaService) { }

  ngOnInit(): void {
    this.tareaService.getTareaList().subscribe(data => {
      this.tareas = data;
    });
  }

}
