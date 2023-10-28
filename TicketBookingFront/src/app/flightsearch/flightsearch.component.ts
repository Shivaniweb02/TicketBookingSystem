import { Component } from '@angular/core';
import { FlightService } from '../Services/FlightServuices/flight.service';
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
@Component({
  selector: 'app-flightsearch',
  templateUrl: './flightsearch.component.html',
  styleUrls: ['./flightsearch.component.css']
})
export class FlightsearchComponent {
  source: string ;
  destination: string ;
  flights: Flight[] = [];

  constructor(private flightService: FlightService) {
    this.source=''
    this.destination=''
  }

  searchFlights() {
    this.flightService.searchFlights(this.source, this.destination)
      .subscribe((data: Flight[]) => {
        this.flights = data;
      });
  }
  }

