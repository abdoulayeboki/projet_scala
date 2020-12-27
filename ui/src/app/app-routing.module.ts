import { NiveauListComponent } from './components/niveau-list/niveau-list.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouteExampleComponent } from './route-example/route-example.component';
import { AccueilComponent } from './accueil/accueil.component';
import { RouterModule, Routes } from '@angular/router';
import { NiveauAddComponent } from './components/niveau-add/niveau-add.component';


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
    path: 'niveau_list',
    component: NiveauListComponent,
  },
  {
    path: 'niveau_add',
    component: NiveauAddComponent,
  },

   {
    path: 'todos',
    component: AccueilComponent,
    // data: { technology: 'Play' }
  }
  // {
  //   path: '**',
  //   redirectTo: '/play',
  //   pathMatch: 'full'
  // }
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
