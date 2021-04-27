import { Component, OnInit } from '@angular/core';
import { ServicioPruebaService } from './servicio-prueba.service';
import { ClasePruebaRespuesta } from './clasepruebarespuesta';
@Component({
  selector: 'app-componente-prueba',
  templateUrl: './componente-prueba.component.html',
  styleUrls: ['./componente-prueba.component.css']
})
export class ComponentePruebaComponent implements OnInit {

  listaPersonas: Array<ClasePruebaRespuesta> = [];
  personaFormulario: ClasePruebaRespuesta;
  isEditable = false;

  constructor(private service: ServicioPruebaService) { }

  ngOnInit() {
    this.pintaListaPersona();
  }


  pintaListaPersona() {
    this.listaPersonas = [];
    this.service.getRespuesta().subscribe((data: Array<ClasePruebaRespuesta>) => {
      data.forEach(element => {
        this.listaPersonas.push(element);
      });
    });
  }

  saveNewPersona() {
    const nuevaPersona = { nombre: "caenHiroSerivice" };
    this.service.postAddPersona(nuevaPersona).subscribe(persona => {
      console.log(persona);
      this.listaPersonas.push(persona);
    });

  }

  updatePersona(nuevaPersona: ClasePruebaRespuesta) {
    //  const nuevaPersona = {idPersona: 13,   nombre: 'caenHiro13' };
    this.service.putUpdatePersona(nuevaPersona).subscribe(persona => {
      console.log(persona);
      this.listaPersonas.forEach(p => {
        if (p.idPersona == nuevaPersona.idPersona) {
          p.nombre = nuevaPersona.nombre;
        }
      });
      this.pintaImput();
    });
  }

  deletePersona(nuevaPersona: ClasePruebaRespuesta): void {
    //  const nuevaPersona = {idPersona: 13,   nombre: 'caenHiro13' };
    this.service.deletePersona(nuevaPersona.idPersona).subscribe();
    this.listaPersonas = this.listaPersonas.filter(p => p.idPersona != nuevaPersona.idPersona);

  }

  inicializaPersona(nuevaPersona: ClasePruebaRespuesta): void {
    this.personaFormulario = nuevaPersona;
  }

  pintaImput(): void {
    this.isEditable = !this.isEditable;
  }

}
