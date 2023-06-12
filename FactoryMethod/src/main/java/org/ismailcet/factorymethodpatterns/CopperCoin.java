package org.ismailcet.factorymethodpatterns;

public class CopperCoin implements Coin{
    static final String DESCRIPTION = "This is a copper coin ! ";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
