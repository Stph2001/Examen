import { Component, OnInit } from '@angular/core';
import { TUser } from '../t-user';
import { TUserService } from '../t-user.service';
import { Router } from '@angular/router'

@Component({
  selector: 'app-registrar-t-user',
  templateUrl: './registrar-t-user.component.html',
  styleUrls: ['./registrar-t-user.component.css']
})
export class RegistrarTUserComponent implements OnInit {

  t_user: TUser = new TUser();

  constructor(private t_userService:TUserService, private router: Router) { }

  ngOnInit(): void {
    
  }

  postT_user(){
    this.t_user.avatar="string";
    this.t_user.pass="string";
    this.t_user.uid="string";

    this.t_userService.postT_user(this.t_user).subscribe(dato => {
      this.goToT_users();
    });
  }

  goToT_users(){
    this.router.navigate(['/t_users']);
  }

  onSubmit(){
    this.postT_user();
  }
}
