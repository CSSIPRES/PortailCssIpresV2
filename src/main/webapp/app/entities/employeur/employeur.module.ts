import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { PortailCssIpresV2SharedModule } from 'app/shared/shared.module';
import { EmployeurComponent } from './employeur.component';
import { EmployeurDetailComponent } from './employeur-detail.component';
import { EmployeurUpdateComponent } from './employeur-update.component';
import { EmployeurDeleteDialogComponent } from './employeur-delete-dialog.component';
import { employeurRoute } from './employeur.route';

@NgModule({
  imports: [PortailCssIpresV2SharedModule, RouterModule.forChild(employeurRoute)],
  declarations: [EmployeurComponent, EmployeurDetailComponent, EmployeurUpdateComponent, EmployeurDeleteDialogComponent],
  entryComponents: [EmployeurDeleteDialogComponent]
})
export class PortailCssIpresV2EmployeurModule {}
