import { TUser } from './../t-user'
import { Component, OnInit } from '@angular/core';
import { TUserService } from '../t-user.service';
import { Router } from '@angular/router'

@Component({
  selector: 'app-lista-t-users',
  templateUrl: './lista-t-users.component.html',
  styleUrls: ['./lista-t-users.component.css']
})
export class ListaTUsersComponent implements OnInit {

  t_users:TUser[];

  constructor(private t_userService: TUserService, private router: Router) { }

  ngOnInit(): void {
    this.getT_users();
  }

  actualizarT_user(id: number){
    console.log("Mandar a editar");
  }

  eliminarT_user(id: number){
    console.log(id);
    this.t_userService.deleteT_user(id).subscribe(dato => {
      this.getT_users();
    });
  }

  private getT_users(){
    this.t_userService.getListaT_users().subscribe(dato => {
      this.t_users = JSON.parse(JSON.stringify(dato)).data;
    });
  }

  verDetallesdelT_user(id: number){
    this.router.navigate(['t_user-detalles', id]);
  }
}
