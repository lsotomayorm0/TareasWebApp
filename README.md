# TareasWebApp
Proyecto de aplicación web básico sobre un CRUD para lista de tareas empleando Spring Boot, Maven y los principios REST para el API del backend y uso de Angular para el frontend. Uso de base da datos MySQL.

## Alcance actual del proyecto
### _Por el lado del backend_
El proyecto cumple con los requerimientos establecidos. El API se adhiere en implementación a los principios REST según la documentación en la página oficial de [Spring]
empleando los métodos HTTP: __GET__, __POST__, __PUT__ y __DELETE__.

### _Por el lado del frontend_
El proyecto no alcazó a cumplir los requerimientos en cuanto al consumo del API del lado banckend, se logró un avance en tanto al diseño de la interfáz según las muestras dadas.

## URL para el consumo del _APIREST_ y estructura del _JSON_
### _URL_
GET/POST:
```sh
http://localhost:8080/api/tareas
```
PUT/DELETE:
```sh
http://localhost:8080/api/tareas/{id}
```
### _JSON_ ejemplo

```sh
{
  "idtarea": 1,
  "titulo": "Prueba 1 - Título",
  "descripcion": "Prueba 1 - Descripción",
  "fechacreacion": "2022-06-13 14:40:59",
  "fechaactualizacion": "2022-06-13 14:40:59",
  "fechaeliminacion": "2022-06-13 14:40:59",
  "estado": "P",
  "eliminado": "0",
  "secuencia": 1,
  "subtarea": 0
}
```

[Spring]: <https://spring.io/guides/tutorials/rest/>
