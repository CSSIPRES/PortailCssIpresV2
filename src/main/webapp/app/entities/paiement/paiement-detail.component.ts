import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { JhiDataUtils } from 'ng-jhipster';

import { IPaiement } from 'app/shared/model/paiement.model';

@Component({
  selector: 'jhi-paiement-detail',
  templateUrl: './paiement-detail.component.html'
})
export class PaiementDetailComponent implements OnInit {
  paiement: IPaiement | null = null;

  constructor(protected dataUtils: JhiDataUtils, protected activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ paiement }) => (this.paiement = paiement));
  }

  byteSize(base64String: string): string {
    return this.dataUtils.byteSize(base64String);
  }

  openFile(contentType: string, base64String: string): void {
    this.dataUtils.openFile(contentType, base64String);
  }

  previousState(): void {
    window.history.back();
  }
}
