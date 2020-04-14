import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';
import { JhiDataUtils } from 'ng-jhipster';

import { PortailCssIpresV2TestModule } from '../../../test.module';
import { PaiementDetailComponent } from 'app/entities/paiement/paiement-detail.component';
import { Paiement } from 'app/shared/model/paiement.model';

describe('Component Tests', () => {
  describe('Paiement Management Detail Component', () => {
    let comp: PaiementDetailComponent;
    let fixture: ComponentFixture<PaiementDetailComponent>;
    let dataUtils: JhiDataUtils;
    const route = ({ data: of({ paiement: new Paiement(123) }) } as any) as ActivatedRoute;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresV2TestModule],
        declarations: [PaiementDetailComponent],
        providers: [{ provide: ActivatedRoute, useValue: route }]
      })
        .overrideTemplate(PaiementDetailComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(PaiementDetailComponent);
      comp = fixture.componentInstance;
      dataUtils = fixture.debugElement.injector.get(JhiDataUtils);
    });

    describe('OnInit', () => {
      it('Should load paiement on init', () => {
        // WHEN
        comp.ngOnInit();

        // THEN
        expect(comp.paiement).toEqual(jasmine.objectContaining({ id: 123 }));
      });
    });

    describe('byteSize', () => {
      it('Should call byteSize from JhiDataUtils', () => {
        // GIVEN
        spyOn(dataUtils, 'byteSize');
        const fakeBase64 = 'fake base64';

        // WHEN
        comp.byteSize(fakeBase64);

        // THEN
        expect(dataUtils.byteSize).toBeCalledWith(fakeBase64);
      });
    });

    describe('openFile', () => {
      it('Should call openFile from JhiDataUtils', () => {
        // GIVEN
        spyOn(dataUtils, 'openFile');
        const fakeContentType = 'fake content type';
        const fakeBase64 = 'fake base64';

        // WHEN
        comp.openFile(fakeContentType, fakeBase64);

        // THEN
        expect(dataUtils.openFile).toBeCalledWith(fakeContentType, fakeBase64);
      });
    });
  });
});
