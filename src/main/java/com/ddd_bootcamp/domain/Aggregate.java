package com.ddd_bootcamp.domain;

import com.ddd_bootcamp.domain.events.DomainEvent;

import java.util.ArrayList;
import java.util.List;

public class Aggregate {

    List<DomainEvent> domainEvents = new ArrayList<>();

    public List<DomainEvent> getDomainEvents() {
        return domainEvents;
    }

    public void clearEvents() {
        domainEvents.clear();
    }
}
