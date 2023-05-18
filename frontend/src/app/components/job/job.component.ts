import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/services/admin.service';
import { JobService } from 'src/app/services/job.service';

@Component({
  selector: 'app-job',
  templateUrl: './job.component.html',
  styleUrls: ['./job.component.css']
})
export class JobComponent implements OnInit{
  job: any;

  constructor(private adminService:AdminService,private jobService:JobService){
    
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

delJob(jname:any)
{
return this.jobService.deleteJob(jname).subscribe((data:any)=>
{
this.ngOnInit();
})
}



}
