import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'employeur',
        loadChildren: () => import('./employeur/employeur.module').then(m => m.PortailCssIpresV2EmployeurModule)
      },
      {
        path: 'document-url',
        loadChildren: () => import('./document-url/document-url.module').then(m => m.PortailCssIpresV2DocumentUrlModule)
      },
      {
        path: 'demande-service',
        loadChildren: () => import('./demande-service/demande-service.module').then(m => m.PortailCssIpresV2DemandeServiceModule)
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class PortailCssIpresV2EntityModule {}
