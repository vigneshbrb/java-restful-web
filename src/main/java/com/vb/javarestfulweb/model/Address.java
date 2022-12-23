package com.vb.javarestfulweb.model;

import java.io.Serializable;

public class Address {

    Address() {}
    private static final Address initializedAddress = new Address() ;

    private String doorNo;

    private String street;

}
