import { GradeServiceService } from './service/grade-service.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HTTP_INTERCEPTORS, HttpClientModule, HttpClientXsrfModule } from '@angular/common/http';
import { AccueilComponent } from './accueil/accueil.component';

import { AppComponent } from './app.component';
import { RouteExampleComponent } from './route-example/route-example.component';

import { AppService } from './app.service';
import { AppHttpInterceptorService } from './http-interceptor.service';
import { AppRoutingModule } from './app-routing.module';
import { HeaderComponent } from './layout/header/header.component';
import { SidebarComponent } from './layout/sidebar/sidebar.component';
import { NiveauListComponent } from './components/niveau-list/niveau-list.component';
import { NiveauAddComponent } from './components/niveau-add/niveau-add.component';
import { GradeListComponent } from './components/grade-list/grade-list.component';
import { GradeAddComponent } from './components/grade-add/grade-add.component';
import { EtudiantListComponent } from './components/etudiant-list/etudiant-list.component';
import { EtudiantAddComponent } from './components/etudiant-add/etudiant-add.component';
import { ProfesseurListComponent } from './components/professeur-list/professeur-list.component';
import { ProfesseurAddComponent } from './components/professeur-add/professeur-add.component';
import { CoursComponent } from './components/cours/cours.component';
import { ClasseListComponent } from './components/classe-list/classe-list.component';
import { ClasseAddComponent } from './components/classe-add/classe-add.component';
import { CoursAddComponent } from './components/cours-add/cours-add.component';
import { CoursListComponent } from './components/cours-list/cours-list.component';
import { NoteAddComponent } from './components/note-add/note-add.component';
import { NoteListComponent } from './components/note-list/note-list.component';
import { SalleListComponent } from './components/salle-list/salle-list.component';
import { SalleAddComponent } from './components/salle-add/salle-add.component';



@NgModule({
  declarations: [
    AppComponent,
    RouteExampleComponent,
    AccueilComponent,
    HeaderComponent,
    SidebarComponent,
    NiveauListComponent,
    NiveauAddComponent,
    GradeListComponent,
    GradeAddComponent,
    EtudiantListComponent,
    EtudiantAddComponent,
    ProfesseurListComponent,
    ProfesseurAddComponent,
    CoursComponent,
    ClasseListComponent,
    ClasseAddComponent,
    CoursAddComponent,
    CoursListComponent,
    NoteAddComponent,
    NoteListComponent,
    SalleListComponent,
    SalleAddComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpClientXsrfModule.withOptions({
      cookieName: 'Csrf-Token',
      headerName: 'Csrf-Token',
    }),
    AppRoutingModule
    
  ],
  providers: [
    AppService,
    GradeServiceService,
    {
      multi: true,
      provide: HTTP_INTERCEPTORS,
      useClass: AppHttpInterceptorService
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
