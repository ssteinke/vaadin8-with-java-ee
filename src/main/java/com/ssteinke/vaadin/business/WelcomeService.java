
package com.ssteinke.vaadin.business;

import javax.ejb.Stateless;

@Stateless
public class WelcomeService {

    public String welcome() {
        return "Hello, Developer! Enjoy Vaadin 8 with Java EE!";
    }
}
