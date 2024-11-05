package com.ps;

import java.util.List;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable valuable){
        assets.add(valuable);
    }

    public double getValue(){
        double totalValue = 0;

        for(Valuable asset: assets){
            totalValue += asset.getValue();
        }

        return totalValue;
    }

    public Valuable getMostValuable(){
        Valuable mostValuable = assets.get(0);

        for(int i=1;i<assets.size();i++){
            Valuable currentAsset = assets.get(i);
            if(currentAsset.getValue() > mostValuable.getValue()){
                mostValuable = currentAsset;
            }
        }

        return mostValuable;
    }

    public Valuable getLeastValuable(){
        Valuable leaseValuable = assets.get(0);

        for(int i=1;i<assets.size();i++){
            Valuable currentAsset = assets.get(i);
            if(currentAsset.getValue() < leaseValuable.getValue()){
                leaseValuable = currentAsset;
            }
        }

        return leaseValuable;
    }

}
