package org.vaadin.guice.tutorial.views;


import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import org.ilay.Authorization;

import static org.vaadin.guice.tutorial.CurrentUserRole.ADMIN;

public class AdminView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "adminView";

    public AdminView() {
        addComponent(new Label("admin view"));
        Authorization.restrictView(this).to(ADMIN);
    }

    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}