import { TUserService } from '../t-user.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { TUser } from '../t-user';

@Component({
  selector: 'app-t-user-detalles',
  templateUrl: './t-user-detalles.component.html',
  styleUrls: ['./t-user-detalles.component.css']
})
export class TUserDetallesComponent implements OnInit {

  id: number;
  t_user: TUser;
  constructor(private route: ActivatedRoute, private t_userService: TUserService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.t_user = new TUser();
    this.t_userService.getT_userById(this.id).subscribe(dato => {
      this.t_user = JSON.parse(JSON.stringify(dato)).data;
    })
  }

}
