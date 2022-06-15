import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tarea } from './tarea'

@Injectable({
  providedIn: 'root'
})
export class TareaService {

  private url = "http://localhost:8080/api/tareas"

  constructor(private httpClient:HttpClient) { }

  getTareaList():Observable<Tarea[]>{
    return this.httpClient.get<Tarea[]>(`${this.url}`);
  }

}
