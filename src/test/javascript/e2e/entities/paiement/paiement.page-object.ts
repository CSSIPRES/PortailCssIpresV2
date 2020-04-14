import { element, by, ElementFinder } from 'protractor';

export class PaiementComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('jhi-paiement div table .btn-danger'));
  title = element.all(by.css('jhi-paiement div h2#page-heading span')).first();
  noResult = element(by.id('no-result'));
  entities = element(by.id('entities'));

  async clickOnCreateButton(): Promise<void> {
    await this.createButton.click();
  }

  async clickOnLastDeleteButton(): Promise<void> {
    await this.deleteButtons.last().click();
  }

  async countDeleteButtons(): Promise<number> {
    return this.deleteButtons.count();
  }

  async getTitle(): Promise<string> {
    return this.title.getAttribute('jhiTranslate');
  }
}

export class PaiementUpdatePage {
  pageTitle = element(by.id('jhi-paiement-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));

  numeroOrdreVirementInput = element(by.id('field_numeroOrdreVirement'));
  banqueSourceInput = element(by.id('field_banqueSource'));
  numeroCompteSourceInput = element(by.id('field_numeroCompteSource'));
  banqueDestinationInput = element(by.id('field_banqueDestination'));
  numeroCompteDestinationInput = element(by.id('field_numeroCompteDestination'));
  referenceFactureInput = element(by.id('field_referenceFacture'));
  montantTotalInput = element(by.id('field_montantTotal'));
  montantAccountInput = element(by.id('field_montantAccount'));
  etatInput = element(by.id('field_etat'));
  fileJoinInput = element(by.id('field_fileJoin'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setNumeroOrdreVirementInput(numeroOrdreVirement: string): Promise<void> {
    await this.numeroOrdreVirementInput.sendKeys(numeroOrdreVirement);
  }

  async getNumeroOrdreVirementInput(): Promise<string> {
    return await this.numeroOrdreVirementInput.getAttribute('value');
  }

  async setBanqueSourceInput(banqueSource: string): Promise<void> {
    await this.banqueSourceInput.sendKeys(banqueSource);
  }

  async getBanqueSourceInput(): Promise<string> {
    return await this.banqueSourceInput.getAttribute('value');
  }

  async setNumeroCompteSourceInput(numeroCompteSource: string): Promise<void> {
    await this.numeroCompteSourceInput.sendKeys(numeroCompteSource);
  }

  async getNumeroCompteSourceInput(): Promise<string> {
    return await this.numeroCompteSourceInput.getAttribute('value');
  }

  async setBanqueDestinationInput(banqueDestination: string): Promise<void> {
    await this.banqueDestinationInput.sendKeys(banqueDestination);
  }

  async getBanqueDestinationInput(): Promise<string> {
    return await this.banqueDestinationInput.getAttribute('value');
  }

  async setNumeroCompteDestinationInput(numeroCompteDestination: string): Promise<void> {
    await this.numeroCompteDestinationInput.sendKeys(numeroCompteDestination);
  }

  async getNumeroCompteDestinationInput(): Promise<string> {
    return await this.numeroCompteDestinationInput.getAttribute('value');
  }

  async setReferenceFactureInput(referenceFacture: string): Promise<void> {
    await this.referenceFactureInput.sendKeys(referenceFacture);
  }

  async getReferenceFactureInput(): Promise<string> {
    return await this.referenceFactureInput.getAttribute('value');
  }

  async setMontantTotalInput(montantTotal: string): Promise<void> {
    await this.montantTotalInput.sendKeys(montantTotal);
  }

  async getMontantTotalInput(): Promise<string> {
    return await this.montantTotalInput.getAttribute('value');
  }

  async setMontantAccountInput(montantAccount: string): Promise<void> {
    await this.montantAccountInput.sendKeys(montantAccount);
  }

  async getMontantAccountInput(): Promise<string> {
    return await this.montantAccountInput.getAttribute('value');
  }

  async setEtatInput(etat: string): Promise<void> {
    await this.etatInput.sendKeys(etat);
  }

  async getEtatInput(): Promise<string> {
    return await this.etatInput.getAttribute('value');
  }

  async setFileJoinInput(fileJoin: string): Promise<void> {
    await this.fileJoinInput.sendKeys(fileJoin);
  }

  async getFileJoinInput(): Promise<string> {
    return await this.fileJoinInput.getAttribute('value');
  }

  async save(): Promise<void> {
    await this.saveButton.click();
  }

  async cancel(): Promise<void> {
    await this.cancelButton.click();
  }

  getSaveButton(): ElementFinder {
    return this.saveButton;
  }
}

export class PaiementDeleteDialog {
  private dialogTitle = element(by.id('jhi-delete-paiement-heading'));
  private confirmButton = element(by.id('jhi-confirm-delete-paiement'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
