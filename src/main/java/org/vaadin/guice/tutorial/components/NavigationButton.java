package org.vaadin.guice.tutorial.components;

import com.vaadin.ui.Button;

import static com.vaadin.ui.themes.ValoTheme.BUTTON_SMALL;

abstract class NavigationButton extends Button implements Button.ClickListener {

    private final String viewName;

    NavigationButton(String viewName) {
        super(viewName);
        this.viewName = viewName;
        addStyleName(BUTTON_SMALL);
        addClickListener(this);
    }

    @Override
    public void buttonClick(ClickEvent event) {
        getUI().getNavigator().navigateTo(viewName);
    }
}
