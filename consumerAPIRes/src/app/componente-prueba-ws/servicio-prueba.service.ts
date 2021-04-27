import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {ClasePruebaRespuesta } from './clasepruebarespuesta';
import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class ServicioPruebaService {

  private url = '/api/';

  constructor( private http: HttpClient) {}

  getRespuesta(): Observable<ClasePruebaRespuesta[]> {
    return this.http.get<ClasePruebaRespuesta[]>(this.url.concat('listarJson'));
  }

  postAddPersona(persona: ClasePruebaRespuesta): Observable<ClasePruebaRespuesta> {
    return  this.http.post<ClasePruebaRespuesta>(this.url.concat('agregar'),  persona);
  }

  putUpdatePersona(persona: ClasePruebaRespuesta): Observable<ClasePruebaRespuesta> {
    return  this.http.put<ClasePruebaRespuesta>(this.url.concat('modificar'),  persona);
  }

  deletePersona(id: number ): Observable<{}> {
     return  this.http.delete(this.url + id);
}

}