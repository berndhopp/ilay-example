package org.vaadin.guice.tutorial.components;

import com.vaadin.ui.VerticalLayout;

public class RootLayout extends VerticalLayout {

    public RootLayout(Header header, ViewContainer viewContainer) {
        setSizeFull();
        setMargin(true);
        setSpacing(true);
        addComponents(header, viewContainer);
        setExpandRatio(viewContainer, 1);
    }
}
