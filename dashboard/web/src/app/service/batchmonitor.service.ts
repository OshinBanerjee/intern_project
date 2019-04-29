import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class BatchmonitorService {


  constructor(private http: HttpClient) { }

  addBatchService(endPoint:any,batchJson:any){
    console.log('Inside addBatchService()');
    console.log('REST URL:'+endPoint);
    this.http.post(endPoint,batchJson).subscribe(
      data=>{
        console.log(data);
      }
    )
  }
}
