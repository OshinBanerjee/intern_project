import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class SchedulemonitorService {


  constructor(private http: HttpClient) { }

  addscheduleService(endPoint:any,scheduleJson:any){
    console.log('Inside addScheduleService()');
    console.log('REST URL:'+endPoint);
    this.http.post(endPoint,scheduleJson).subscribe(
      data=>{
        console.log(data);
      }
    )
  }
}
