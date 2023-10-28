import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FlightsearchComponent } from './flightsearch.component';

describe('FlightsearchComponent', () => {
  let component: FlightsearchComponent;
  let fixture: ComponentFixture<FlightsearchComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FlightsearchComponent]
    });
    fixture = TestBed.createComponent(FlightsearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
