package org.vaadin.guice.tutorial.grid;

import com.vaadin.ui.Grid;
import org.ilay.Authorization;
import org.vaadin.guice.tutorial.CurrentUserRole;

public class RestrictedGrid extends Grid<GridItem> {

    public RestrictedGrid(){
        super(GridItem.class);
        setItems(
                new GridItem(CurrentUserRole.ADMIN, "secret", 1),
                new GridItem(CurrentUserRole.ADMIN, "top secret", 2),
                new GridItem(CurrentUserRole.USER, "not so secret", 3)
        );

        Authorization.restrictData(GridItem.class, this);
    }
}
