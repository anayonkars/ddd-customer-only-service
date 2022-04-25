package com.ddd_bootcamp.domain.events;




import java.util.UUID;

public class CustomerAddressUpdatedEvent implements DomainEvent {
    private UUID customerId;
    private AddressVO address;


    public CustomerAddressUpdatedEvent(UUID customerId, AddressVO address) {
        this.customerId = customerId;
        this.address = address;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public AddressVO getAddress() {
        return address;
    }
}
