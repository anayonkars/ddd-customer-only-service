package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private UUID customerId;
    private Address address;
    private List<AccountId> accountIds = new ArrayList<>();

    public Customer(Address address) {
        this.customerId = UUID.randomUUID();
        this.address = address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    public void add(AccountId accountId) {
        accountIds.add(accountId);
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public Address getAddress() {
        return address;
    }

    public List<AccountId> getAccountIds() {
        return accountIds;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", address=" + address +
                ", accountIds=" + accountIds +
                '}';
    }


}
