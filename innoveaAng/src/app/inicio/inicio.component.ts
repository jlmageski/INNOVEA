import { texto } from '../Service/texto';
import { Component, OnInit } from '@angular/core';
import { ServicoService } from '../Service/servico.service';
import { arquivo } from '../Service/arquivo';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']

})
export class InicioComponent implements OnInit {
  arq: arquivo[] = [];

  constructor(private service : ServicoService) {

  }

  ngOnInit(): void {
    this.service.getList()
      .subscribe(resposta => this.arq = resposta);
  }
}

