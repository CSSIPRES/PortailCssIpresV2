export interface IPaiement {
  id?: number;
  numeroOrdreVirement?: string;
  banqueSource?: string;
  numeroCompteSource?: string;
  banqueDestination?: string;
  numeroCompteDestination?: string;
  referenceFacture?: string;
  montantTotal?: number;
  montantAccount?: number;
  etat?: string;
  fileJoin?: any;
}

export class Paiement implements IPaiement {
  constructor(
    public id?: number,
    public numeroOrdreVirement?: string,
    public banqueSource?: string,
    public numeroCompteSource?: string,
    public banqueDestination?: string,
    public numeroCompteDestination?: string,
    public referenceFacture?: string,
    public montantTotal?: number,
    public montantAccount?: number,
    public etat?: string,
    public fileJoin?: any
  ) {}
}
