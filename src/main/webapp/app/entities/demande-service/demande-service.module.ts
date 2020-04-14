import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { PortailCssIpresV2SharedModule } from 'app/shared/shared.module';
import { DemandeServiceComponent } from './demande-service.component';
import { DemandeServiceDetailComponent } from './demande-service-detail.component';
import { DemandeServiceUpdateComponent } from './demande-service-update.component';
import { DemandeServiceDeleteDialogComponent } from './demande-service-delete-dialog.component';
import { demandeServiceRoute } from './demande-service.route';

@NgModule({
  imports: [PortailCssIpresV2SharedModule, RouterModule.forChild(demandeServiceRoute)],
  declarations: [
    DemandeServiceComponent,
    DemandeServiceDetailComponent,
    DemandeServiceUpdateComponent,
    DemandeServiceDeleteDialogComponent
  ],
  entryComponents: [DemandeServiceDeleteDialogComponent]
})
export class PortailCssIpresV2DemandeServiceModule {}
