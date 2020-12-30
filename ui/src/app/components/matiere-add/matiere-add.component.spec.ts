import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MatiereAddComponent } from './matiere-add.component';

describe('MatiereAddComponent', () => {
  let component: MatiereAddComponent;
  let fixture: ComponentFixture<MatiereAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MatiereAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MatiereAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
