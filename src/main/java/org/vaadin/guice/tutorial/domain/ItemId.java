package org.vaadin.guice.tutorial.domain;

public class ItemId {
    private final long itemId;

    public ItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getItemId() {
        return itemId;
    }
}
