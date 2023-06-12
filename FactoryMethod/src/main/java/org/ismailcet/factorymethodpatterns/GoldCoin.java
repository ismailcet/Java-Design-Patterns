package org.ismailcet.factorymethodpatterns;

public class GoldCoin implements Coin {
    static final String DESCRIPTION  = "This is a gold coin ! ";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
