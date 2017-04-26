package org.vaadin.guice.tutorial.views;

import com.vaadin.ui.Label;
import org.ilay.TypedAuthorizationView;
import org.vaadin.guice.tutorial.domain.ItemId;

public class ItemsView extends TypedAuthorizationView<ItemId> {

    @Override
    protected ItemId parse(String parameters) throws TypedAuthorizationView.ParseException {
        try {
            return new ItemId(Long.parseLong(parameters));
        } catch (NumberFormatException e) {
            throw new ParseException(e);
        }
    }

    @Override
    protected void enter(ItemId o) {
        setCompositionRoot(new Label("item id is " + o.getItemId()));
    }
}

