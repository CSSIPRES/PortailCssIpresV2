import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { JhiDataUtils, JhiFileLoadError, JhiEventManager, JhiEventWithContent } from 'ng-jhipster';

import { IPaiement, Paiement } from 'app/shared/model/paiement.model';
import { PaiementService } from './paiement.service';
import { AlertError } from 'app/shared/alert/alert-error.model';

@Component({
  selector: 'jhi-paiement-update',
  templateUrl: './paiement-update.component.html'
})
export class PaiementUpdateComponent implements OnInit {
  isSaving = false;

  editForm = this.fb.group({
    id: [],
    numeroOrdreVirement: [],
    banqueSource: [],
    numeroCompteSource: [],
    banqueDestination: [],
    numeroCompteDestination: [],
    referenceFacture: [],
    montantTotal: [],
    montantAccount: [],
    etat: [],
    fileJoin: []
  });

  constructor(
    protected dataUtils: JhiDataUtils,
    protected eventManager: JhiEventManager,
    protected paiementService: PaiementService,
    protected activatedRoute: ActivatedRoute,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ paiement }) => {
      this.updateForm(paiement);
    });
  }

  updateForm(paiement: IPaiement): void {
    this.editForm.patchValue({
      id: paiement.id,
      numeroOrdreVirement: paiement.numeroOrdreVirement,
      banqueSource: paiement.banqueSource,
      numeroCompteSource: paiement.numeroCompteSource,
      banqueDestination: paiement.banqueDestination,
      numeroCompteDestination: paiement.numeroCompteDestination,
      referenceFacture: paiement.referenceFacture,
      montantTotal: paiement.montantTotal,
      montantAccount: paiement.montantAccount,
      etat: paiement.etat,
      fileJoin: paiement.fileJoin
    });
  }

  byteSize(base64String: string): string {
    return this.dataUtils.byteSize(base64String);
  }

  openFile(contentType: string, base64String: string): void {
    this.dataUtils.openFile(contentType, base64String);
  }

  setFileData(event: Event, field: string, isImage: boolean): void {
    this.dataUtils.loadFileToForm(event, this.editForm, field, isImage).subscribe(null, (err: JhiFileLoadError) => {
      this.eventManager.broadcast(
        new JhiEventWithContent<AlertError>('portailCssIpresV2App.error', { ...err, key: 'error.file.' + err.key })
      );
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const paiement = this.createFromForm();
    if (paiement.id !== undefined) {
      this.subscribeToSaveResponse(this.paiementService.update(paiement));
    } else {
      this.subscribeToSaveResponse(this.paiementService.create(paiement));
    }
  }

  private createFromForm(): IPaiement {
    return {
      ...new Paiement(),
      id: this.editForm.get(['id'])!.value,
      numeroOrdreVirement: this.editForm.get(['numeroOrdreVirement'])!.value,
      banqueSource: this.editForm.get(['banqueSource'])!.value,
      numeroCompteSource: this.editForm.get(['numeroCompteSource'])!.value,
      banqueDestination: this.editForm.get(['banqueDestination'])!.value,
      numeroCompteDestination: this.editForm.get(['numeroCompteDestination'])!.value,
      referenceFacture: this.editForm.get(['referenceFacture'])!.value,
      montantTotal: this.editForm.get(['montantTotal'])!.value,
      montantAccount: this.editForm.get(['montantAccount'])!.value,
      etat: this.editForm.get(['etat'])!.value,
      fileJoin: this.editForm.get(['fileJoin'])!.value
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IPaiement>>): void {
    result.subscribe(
      () => this.onSaveSuccess(),
      () => this.onSaveError()
    );
  }

  protected onSaveSuccess(): void {
    this.isSaving = false;
    this.previousState();
  }

  protected onSaveError(): void {
    this.isSaving = false;
  }
}
