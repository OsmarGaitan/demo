
package com.og.dm_mvc.models;

/**
 
 * @author JADPA_15
 */
public class Person {
    
    protected String firsine;
    protected String lastname;

    public String getFirsine() {
        return firsine;
    }

    public void setFirsine(String firsine) {
        this.firsine = firsine;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Person(String firsine, String lastname) {
        this.firsine = firsine;
        this.lastname = lastname;
    }
    
    
    
}
