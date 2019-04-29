import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-addschedule',
  templateUrl: './addschedule.component.html',
  styleUrls: ['./addschedule.component.css']
})
export class AddscheduleComponent implements OnInit {

  constructor() { }

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
  }

}
