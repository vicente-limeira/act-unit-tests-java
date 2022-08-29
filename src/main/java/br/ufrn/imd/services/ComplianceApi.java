package br.ufrn.imd.services;

import br.ufrn.imd.models.BankAccount;

import java.io.IOException;

public interface ComplianceApi {
    boolean CanItReceiveNewDeposit(BankAccount account, double value);
}

