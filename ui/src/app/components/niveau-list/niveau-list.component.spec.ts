import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NiveauListComponent } from './niveau-list.component';

describe('NiveauListComponent', () => {
  let component: NiveauListComponent;
  let fixture: ComponentFixture<NiveauListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NiveauListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NiveauListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
