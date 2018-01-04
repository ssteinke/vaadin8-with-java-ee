package com.ssteinke.vaadin.presentation;

import javax.inject.Inject;

import com.ssteinke.vaadin.business.WelcomeService;
import com.vaadin.annotations.Title;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@CDIUI("")
@Title("Vaadin 8 and Java EE")
public class WelcomeUI extends UI {

    @Inject
    WelcomeService service;
    
    @Override
    protected void init(VaadinRequest request) {
        setSizeFull();
        String message = service.welcome();
        Label label = new Label(message);
        setContent(new HorizontalLayout(label));
    }
}
