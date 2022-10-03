import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarTUserComponent } from './registrar-t-user.component';

describe('RegistrarTUserComponent', () => {
  let component: RegistrarTUserComponent;
  let fixture: ComponentFixture<RegistrarTUserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrarTUserComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarTUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
