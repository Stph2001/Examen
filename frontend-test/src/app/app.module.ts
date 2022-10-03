import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaTUsersComponent } from './lista-t-users/lista-t-users.component';
import { HttpClientModule } from '@angular/common/http';
import { RegistrarTUserComponent } from './registrar-t-user/registrar-t-user.component';
import { FormsModule } from '@angular/forms';
import { TUserDetallesComponent } from './t-user-detalles/t-user-detalles.component'

@NgModule({
  declarations: [
    AppComponent,
    ListaTUsersComponent,
    RegistrarTUserComponent,
    TUserDetallesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
