package org.vaadin.guice.tutorial.components;

import org.ilay.Authorization;
import org.vaadin.guice.tutorial.CurrentUserRole;
import org.vaadin.guice.tutorial.views.AdminView;

public class AdminNavigationButton extends NavigationButton {
    public AdminNavigationButton() {
        super(AdminView.VIEW_NAME);
        Authorization.restrictComponent(this).to(CurrentUserRole.ADMIN);
    }
}




