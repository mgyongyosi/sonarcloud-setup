package com.mgyongyosi.smelly;

public class ProblematicOne {
    String fieldOne;
    String fieldTwo;

    public boolean doSomethingBad() {
        if(fieldOne.toUpperCase().equals(fieldTwo)) {
            return true;
        }
        return false;
    }
}
