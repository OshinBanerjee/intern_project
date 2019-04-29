import { Component, OnInit } from '@angular/core';
import { Batch } from '../batch';
import { BatchmonitorService } from '../service/batchmonitor.service';
import { Appsettings } from '../appsettings';

@Component({
  selector: 'app-addbatch',
  templateUrl: './addbatch.component.html',
  styleUrls: ['./addbatch.component.css']
})
export class AddbatchComponent implements OnInit {
  batch:Batch=new Batch();
  
 
  constructor(private service:BatchmonitorService) { }

  ngOnInit() {
   
  }

  addBatch(batch:any){
    console.log('Inside addBatch()');
    console.log(batch.batchID);
    console.log(batch.batchName);
    console.log(batch.exname);
    console.log(batch.expath);
    console.log(batch.lgfileName);
    console.log(batch.lgfileLocation);
    console.log(batch.desp);
    var batchJson={
      "jobId":batch.batchID,
      "jobName":batch.batchName,
       "description":batch.desp,
       "executableName":batch.exname,
       "executablePath":batch.expath,
       "logFileName":batch.lgfileName,
       "logFileLocation":batch.lgfileLocation
    };
    console.log(batchJson);
    console.log('service obj:');
    
    this.service.addBatchService(Appsettings.LOCAL_ENDPOINT+Appsettings.ADDBATCH,batchJson);
  }
}
