package org.vaadin.guice.tutorial.components;

import com.vaadin.data.HasValue;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.NativeSelect;
import org.ilay.Authorization;
import org.vaadin.guice.tutorial.CurrentUserRole;

public class UserSelector extends NativeSelect<CurrentUserRole> implements HasValue.ValueChangeListener<CurrentUserRole> {

    public UserSelector() {
        setItems(CurrentUserRole.USER, CurrentUserRole.ADMIN);
        addValueChangeListener(this);
        setValue(CurrentUserRole.USER);
    }

    @Override
    public void valueChange(ValueChangeEvent<CurrentUserRole> event) {
        VaadinSession.getCurrent().setAttribute(CurrentUserRole.class, event.getValue());
        Authorization.reapplyRestrictions();
    }
}
