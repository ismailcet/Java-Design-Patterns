package org.ismailcet.factorymethodpatterns;

public class CoinFactory {
    public  Coin getCoin(String coin){
        if (coin == "gold") {
            return new GoldCoin();
        } else if (coin == "copper") {
            return new CopperCoin();
        }else{
            return null;
        }
    }
}
