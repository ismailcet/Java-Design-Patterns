package org.ismailcet.factorymethodpatterns;


public class GenerateCoin
{
    public static void main( String[] args ) {

        CoinFactory coin1 = new CoinFactory();
        Coin goldCoin = coin1.getCoin("gold");
        System.out.println(goldCoin.description());

        Coin copperCoin = coin1.getCoin("copper");
        System.out.println(copperCoin.description());
    }
}
