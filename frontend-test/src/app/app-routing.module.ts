import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaTUsersComponent } from './lista-t-users/lista-t-users.component';
import { RegistrarTUserComponent } from './registrar-t-user/registrar-t-user.component';
import { TUserDetallesComponent } from './t-user-detalles/t-user-detalles.component';

const routes: Routes = [
  {path:'t_users', component:ListaTUsersComponent},
  {path:'', redirectTo:'t_users', pathMatch:'full'},
  {path:'registrar-t_user', component:RegistrarTUserComponent},
  {path:'t_user-detalles/:id', component:TUserDetallesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
