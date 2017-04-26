package org.vaadin.guice.tutorial.components;

import com.vaadin.ui.HorizontalLayout;

public class NavigationBar extends HorizontalLayout {

    public NavigationBar(
            DefaultNavigationButton defaultNavigationButton,
            AdminNavigationButton adminNavigationButton,
            UserSelector userSelector
    ) {
        addComponents(
                defaultNavigationButton,
                adminNavigationButton,
                userSelector
        );

        setSpacing(true);
    }
}
