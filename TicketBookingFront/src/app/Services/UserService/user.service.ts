import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
private baseURL: string='http://localhost:8081';

  constructor(private http:HttpClient) { }

  createUser(data:any):Observable<any>{
    const url=`${this.baseURL}/register`;
    return this.http.post(url,data);
  }

  getAllusers():Observable<any[]>{
    const url=`${this.baseURL}/GetAllUser`;
   return this.http.get<any[]>(url);
  }
}
