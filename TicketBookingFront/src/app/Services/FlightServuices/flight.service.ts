import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
  private baseUrl = 'http://localhost:8081'; // Replace with your Spring Boot API URL

  constructor(private http: HttpClient) {}

  searchFlights(source: string, destination: string): Observable<Flight[]> {
    return this.http.get<Flight[]>(`${this.baseUrl}/SearchFlight/${source}/${destination}`);
  }
}
interface Flight {
  flightID: number;
  FlightName: string;
  source: string;
  destination: string;
  boardingTime: string;
  duration: number;
  layover: boolean;
  layover_city: string;
}
