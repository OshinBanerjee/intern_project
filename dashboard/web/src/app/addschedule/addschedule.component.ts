import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-addschedule',
  templateUrl: './addschedule.component.html',
  styleUrls: ['./addschedule.component.css']
})
export class AddscheduleComponent implements OnInit {
schedule:Schedule=new Schedule();
  
  constructor(private service:SchedulemonitorService) { }

  ngOnInit() {
  }
  addSchedule(schedule:any){
    console.log('Inside addSchedule()');
    console.log(schedule.servName);
    console.log(schedule.jobId);
    console.log(schedule.exename);
    console.log(schedule.maxdur);
    console.log(schedule.depend);
    console.log(schedule.runDays);
    console.log(schedule.sTime);
    console.log(schedule.eTime);
    
        var scheduleJson={
      "servName":batch.servName,
      "jobId":batch.jobId,
       "exename":batch.exename,
       "maxdur":batch.maxdur,
       "depend":batch.depend,
       "runDays":batch.runDays,
       "sTime":batch.sTime,
          "eTime":batch.eTime
    };
    console.log(scheduleJson);
    console.log('service obj:');
    
    this.service.addScheduleService(Appsettings.LOCAL_ENDPOINT+Appsettings.ADDSCHEDULE,scheduleJson);
  }

}
