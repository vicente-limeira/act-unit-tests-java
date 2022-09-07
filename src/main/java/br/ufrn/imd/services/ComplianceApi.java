package br.ufrn.imd.services;

import br.ufrn.imd.models.BankAccount;

public interface ComplianceApi {
    boolean CanItReceiveNewDeposit(BankAccount account, double value);
    boolean CanItReceiveNewWithDraw(BankAccount account, double value);
}
