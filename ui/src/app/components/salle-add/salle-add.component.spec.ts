import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SalleAddComponent } from './salle-add.component';

describe('SalleAddComponent', () => {
  let component: SalleAddComponent;
  let fixture: ComponentFixture<SalleAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SalleAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SalleAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
