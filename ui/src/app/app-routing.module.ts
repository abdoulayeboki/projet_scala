import { CoursAddComponent } from './components/cours-add/cours-add.component';
import { CoursListComponent } from './components/cours-list/cours-list.component';
import { ProfesseurAddComponent } from './components/professeur-add/professeur-add.component';
import { EtudiantListComponent } from './components/etudiant-list/etudiant-list.component';
import { NiveauListComponent } from './components/niveau-list/niveau-list.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouteExampleComponent } from './route-example/route-example.component';
import { AccueilComponent } from './accueil/accueil.component';
import { RouterModule, Routes } from '@angular/router';
import { NiveauAddComponent } from './components/niveau-add/niveau-add.component';
import { GradeListComponent } from './components/grade-list/grade-list.component';
import { GradeAddComponent } from './components/grade-add/grade-add.component';
import { EtudiantAddComponent } from './components/etudiant-add/etudiant-add.component';
import { ProfesseurListComponent } from './components/professeur-list/professeur-list.component';


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
    path: 'grade_list',
    component: GradeListComponent,
  },
  {
    path: 'grade_add',
    component: GradeAddComponent,
  },
  {
    path: 'etudiant_list',
    component: EtudiantListComponent,
  },
  {
    path: 'etudiant_add',
    component: EtudiantAddComponent,
  },
  {
    path: 'professeur_list',
    component: ProfesseurListComponent,
  },
  {
    path: 'professeur_add',
    component: ProfesseurAddComponent,
  },
  {
    path: 'cours_list',
    component: CoursListComponent,
  },
  {
    path: 'cours_add',
    component: CoursAddComponent,
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
