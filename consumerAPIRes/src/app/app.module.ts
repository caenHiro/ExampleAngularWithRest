import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { ComponentePruebaComponent } from './componente-prueba-ws/componente-prueba.component';
import {ServicioPruebaService} from './componente-prueba-ws/servicio-prueba.service';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ComponentePruebaComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers:  [
    ServicioPruebaService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
