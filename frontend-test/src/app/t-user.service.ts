import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TUser } from './t-user';

@Injectable({
  providedIn: 'root'
})
export class TUserService {

  // URL Get T_users
  private baseURL = "http://localhost:8081/test/v1/t_users";

  constructor(private http : HttpClient) { }

  getListaT_users(): Observable<TUser[]>{
    return this.http.get<TUser[]>(`${this.baseURL}`);
  }

  getT_userById(id: number): Observable<TUser>{
    return this.http.get<TUser>(`${this.baseURL}/${id}`);
  }

  postT_user(t_user: TUser): Observable<Object>{
    return this.http.post(`${this.baseURL}`, t_user);
  }

  putT_user(id: number, t_user: TUser): Observable<Object>{
    return this.http.put(`${this.baseURL}/${id}`, t_user)
  }

  deleteT_user(id: number): Observable<Object>{
    return this.http.delete(`${this.baseURL}/${id}`);
  }
}
