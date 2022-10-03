import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TUserDetallesComponent } from './t-user-detalles.component';

describe('TUserDetallesComponent', () => {
  let component: TUserDetallesComponent;
  let fixture: ComponentFixture<TUserDetallesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TUserDetallesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TUserDetallesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
