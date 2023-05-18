import { Component } from '@angular/core';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-jobuser',
  templateUrl: './jobuser.component.html',
  styleUrls: ['./jobuser.component.css']
})
export class JobuserComponent {
  job: any;

  constructor(private adminService:AdminService){
    
  }

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
