import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CoursAddComponent } from './cours-add.component';

describe('CoursAddComponent', () => {
  let component: CoursAddComponent;
  let fixture: ComponentFixture<CoursAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CoursAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CoursAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
