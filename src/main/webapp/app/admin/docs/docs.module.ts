import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { PortailCssIpresV2SharedModule } from 'app/shared/shared.module';

import { DocsComponent } from './docs.component';

import { docsRoute } from './docs.route';

@NgModule({
  imports: [PortailCssIpresV2SharedModule, RouterModule.forChild([docsRoute])],
  declarations: [DocsComponent]
})
export class DocsModule {}
