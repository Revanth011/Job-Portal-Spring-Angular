import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit{

  job:any;

  constructor(private adminService:AdminService){}

  ngOnInit(): void {
    this.getAllJobs();
  }

  getAllJobs()
  {
    return this.adminService.getAllJobs().subscribe((data:any)=>
    {
      this.job=data;
    })
  }

}
