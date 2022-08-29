

package br.ufrn.imd.repositories;

import br.ufrn.imd.models.BankAccount;
import net.ravendb.client.documents.session.IDocumentSession;

import java.util.UUID;

public class BankAccountRepository implements Repository{
    @Override
    public BankAccount get(String uuid) {
        try (IDocumentSession session = DocumentStoreHolder.getStore().openSession()) {
            return session.load(BankAccount.class, uuid);
        }
    }

    @Override
    public Throwable create(BankAccount bankAccount) {
        try (IDocumentSession session = DocumentStoreHolder.getStore().openSession()) {
            session.store(bankAccount, bankAccount.getId());
            session.saveChanges();
        }
        return null;
    }

    @Override
    public void update(BankAccount bankAccount) {
        try (IDocumentSession session = DocumentStoreHolder.getStore().openSession()) {
            session.store(bankAccount, bankAccount.getId());
            session.saveChanges();
        }
    }
}