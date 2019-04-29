import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent } from './dashboard/dashboard.component';
import { AddbatchComponent } from './addbatch/addbatch.component';
import { AddscheduleComponent } from './addschedule/addschedule.component';

const routes: Routes=[
  {path:'', redirectTo:'/dashboard' ,pathMatch:'full'},
  {path:'dashboard', component: DashboardComponent},
  {path:'addbatch', component: AddbatchComponent},
  {path:'addschedule',component: AddscheduleComponent}
];
import { from } from 'rxjs';
@NgModule({
  imports:[RouterModule.forRoot(routes)],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}