import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TareaCrudComponent } from './tarea-crud.component';

describe('TareaCrudComponent', () => {
  let component: TareaCrudComponent;
  let fixture: ComponentFixture<TareaCrudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TareaCrudComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TareaCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
