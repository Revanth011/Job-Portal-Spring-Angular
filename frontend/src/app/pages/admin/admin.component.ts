import { Component, OnInit } from '@angular/core';
import { JobService } from 'src/app/services/job.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit{

public job={
  jname: "",
  cname: "",
  experience: "",
  salary: "",
  jlocation: "",
  jdescription: "",
  apply_link:""
};

constructor(private jobService:JobService){}

ngOnInit(): void {
  
}

postJob(){

  this.jobService.insertJob(this.job).subscribe(
    (data)=>{
      console.log(data);
      Swal.fire("Success!","Job is Posted!","success");
    },
    (error)=>{
      console.log(error);
      Swal.fire({
        icon: 'error',
        title: 'Oops...',
        text: 'Something went wrong!'
      });
    }
  )

}

}
