import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  private adminUrl: string;
  constructor(private http: HttpClient) {
    this.adminUrl = 'http://localhost:8080/user/job';
   }

   getAllJobs()
  {
   return this.http.get("http://localhost:8080/user/job");
  }

   
}
