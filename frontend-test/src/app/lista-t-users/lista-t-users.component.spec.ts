import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaTUsersComponent } from './lista-t-users.component';

describe('ListaTUsersComponent', () => {
  let component: ListaTUsersComponent;
  let fixture: ComponentFixture<ListaTUsersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaTUsersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListaTUsersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
