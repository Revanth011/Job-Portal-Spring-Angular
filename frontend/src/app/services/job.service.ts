import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class JobService {

  constructor(private http:HttpClient) { }

  public insertJob(job:any){
    return this.http.post(`${baseUrl}/user/job` , job);
  }

  deleteJob(jname:any)
  {
   return this.http.delete(`${baseUrl}/user/job/`+jname);
  }
}
