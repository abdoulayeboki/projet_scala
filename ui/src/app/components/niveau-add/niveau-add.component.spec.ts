import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NiveauAddComponent } from './niveau-add.component';

describe('NiveauAddComponent', () => {
  let component: NiveauAddComponent;
  let fixture: ComponentFixture<NiveauAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NiveauAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NiveauAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
