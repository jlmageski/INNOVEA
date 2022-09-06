import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment'
import { arquivo } from './arquivo';

@Injectable({
  providedIn: 'root'
})
export class ServicoService {

  apiURL: string = environment.apiBaseUrl ;

  constructor( private http: HttpClient ) {}

  getList( ) : Observable<arquivo[]> {
    return this.http.get<arquivo[]>(this.apiURL);
  }

}
