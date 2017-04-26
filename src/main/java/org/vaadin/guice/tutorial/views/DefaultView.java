package org.vaadin.guice.tutorial.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.guice.tutorial.grid.RestrictedGrid;

public class DefaultView extends VerticalLayout implements View {

    public DefaultView(RestrictedGrid restrictedGrid) {
        addComponent(restrictedGrid);
    }

    public void enter(ViewChangeEvent event) {
    }
}
