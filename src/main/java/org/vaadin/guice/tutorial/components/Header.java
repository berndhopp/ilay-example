package org.vaadin.guice.tutorial.components;

import com.vaadin.ui.HorizontalLayout;

public class Header extends HorizontalLayout {

    public Header(NavigationBar navigationBar) {
        addComponents(navigationBar);
        setExpandRatio(navigationBar, 1);
        setWidth("100%");
        setSpacing(true);
    }
}
