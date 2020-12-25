import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouteExampleComponent } from './route-example/route-example.component';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  {
    path: 'scala',
    component: RouteExampleComponent,
    data: { technology: 'Scala' }
  },
  {
    path: 'play',
    component: RouteExampleComponent,
    data: { technology: 'Play' }
  },
  {
    path: 'angular',
    component: RouteExampleComponent,
    data: { technology: 'Angular' }
  },
  {
    path: '**',
    redirectTo: '/play',
    pathMatch: 'full'
  }
];
@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes),
  ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
