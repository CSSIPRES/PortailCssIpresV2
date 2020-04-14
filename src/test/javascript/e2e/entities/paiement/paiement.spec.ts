import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../page-objects/jhi-page-objects';

import { PaiementComponentsPage, PaiementDeleteDialog, PaiementUpdatePage } from './paiement.page-object';

const expect = chai.expect;

describe('Paiement e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let paiementComponentsPage: PaiementComponentsPage;
  let paiementUpdatePage: PaiementUpdatePage;
  let paiementDeleteDialog: PaiementDeleteDialog;

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load Paiements', async () => {
    await navBarPage.goToEntity('paiement');
    paiementComponentsPage = new PaiementComponentsPage();
    await browser.wait(ec.visibilityOf(paiementComponentsPage.title), 5000);
    expect(await paiementComponentsPage.getTitle()).to.eq('portailCssIpresV2App.paiement.home.title');
    await browser.wait(ec.or(ec.visibilityOf(paiementComponentsPage.entities), ec.visibilityOf(paiementComponentsPage.noResult)), 1000);
  });

  it('should load create Paiement page', async () => {
    await paiementComponentsPage.clickOnCreateButton();
    paiementUpdatePage = new PaiementUpdatePage();
    expect(await paiementUpdatePage.getPageTitle()).to.eq('portailCssIpresV2App.paiement.home.createOrEditLabel');
    await paiementUpdatePage.cancel();
  });

  it('should create and save Paiements', async () => {
    const nbButtonsBeforeCreate = await paiementComponentsPage.countDeleteButtons();

    await paiementComponentsPage.clickOnCreateButton();

    await promise.all([
      paiementUpdatePage.setNumeroOrdreVirementInput('numeroOrdreVirement'),
      paiementUpdatePage.setBanqueSourceInput('banqueSource'),
      paiementUpdatePage.setNumeroCompteSourceInput('numeroCompteSource'),
      paiementUpdatePage.setBanqueDestinationInput('banqueDestination'),
      paiementUpdatePage.setNumeroCompteDestinationInput('numeroCompteDestination'),
      paiementUpdatePage.setReferenceFactureInput('referenceFacture'),
      paiementUpdatePage.setMontantTotalInput('5'),
      paiementUpdatePage.setMontantAccountInput('5'),
      paiementUpdatePage.setEtatInput('etat'),
      paiementUpdatePage.setFileJoinInput('fileJoin')
    ]);

    expect(await paiementUpdatePage.getNumeroOrdreVirementInput()).to.eq(
      'numeroOrdreVirement',
      'Expected NumeroOrdreVirement value to be equals to numeroOrdreVirement'
    );
    expect(await paiementUpdatePage.getBanqueSourceInput()).to.eq(
      'banqueSource',
      'Expected BanqueSource value to be equals to banqueSource'
    );
    expect(await paiementUpdatePage.getNumeroCompteSourceInput()).to.eq(
      'numeroCompteSource',
      'Expected NumeroCompteSource value to be equals to numeroCompteSource'
    );
    expect(await paiementUpdatePage.getBanqueDestinationInput()).to.eq(
      'banqueDestination',
      'Expected BanqueDestination value to be equals to banqueDestination'
    );
    expect(await paiementUpdatePage.getNumeroCompteDestinationInput()).to.eq(
      'numeroCompteDestination',
      'Expected NumeroCompteDestination value to be equals to numeroCompteDestination'
    );
    expect(await paiementUpdatePage.getReferenceFactureInput()).to.eq(
      'referenceFacture',
      'Expected ReferenceFacture value to be equals to referenceFacture'
    );
    expect(await paiementUpdatePage.getMontantTotalInput()).to.eq('5', 'Expected montantTotal value to be equals to 5');
    expect(await paiementUpdatePage.getMontantAccountInput()).to.eq('5', 'Expected montantAccount value to be equals to 5');
    expect(await paiementUpdatePage.getEtatInput()).to.eq('etat', 'Expected Etat value to be equals to etat');
    expect(await paiementUpdatePage.getFileJoinInput()).to.eq('fileJoin', 'Expected FileJoin value to be equals to fileJoin');

    await paiementUpdatePage.save();
    expect(await paiementUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await paiementComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeCreate + 1, 'Expected one more entry in the table');
  });

  it('should delete last Paiement', async () => {
    const nbButtonsBeforeDelete = await paiementComponentsPage.countDeleteButtons();
    await paiementComponentsPage.clickOnLastDeleteButton();

    paiementDeleteDialog = new PaiementDeleteDialog();
    expect(await paiementDeleteDialog.getDialogTitle()).to.eq('portailCssIpresV2App.paiement.delete.question');
    await paiementDeleteDialog.clickOnConfirmButton();

    expect(await paiementComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
