package com.ddd_bootcamp.domain;

import java.util.UUID;

public class AccountId {

    private UUID accountId;

    public AccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public UUID getAccountIdUUID() {
        return accountId;
    }

    @Override
    public String toString() {
        return "AccountId{" +
                "accountId=" + accountId +
                '}';
    }
}
