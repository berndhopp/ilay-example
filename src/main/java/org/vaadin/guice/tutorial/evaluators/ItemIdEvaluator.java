package org.vaadin.guice.tutorial.evaluators;

import org.ilay.api.InMemoryAuthorizer;
import org.vaadin.guice.tutorial.domain.ItemId;

public class ItemIdEvaluator implements InMemoryAuthorizer<ItemId> {

    @Override
    public boolean isGranted(ItemId permission) {
        //for example...
        return permission.getItemId() < 500;
    }

    @Override
    public Class<ItemId> getPermissionClass() {
        return ItemId.class;
    }
}
