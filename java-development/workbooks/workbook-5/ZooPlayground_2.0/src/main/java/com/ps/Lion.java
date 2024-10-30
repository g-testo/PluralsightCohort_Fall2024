package com.ps;

public class Lion extends Animal{
    private boolean isEasilyFrightened;
    private int prideSize;

    public Lion(String name, String species, int age, String habitatStructure, boolean hasCleanHabitat, String dateLastCleaned, boolean isEasilyFrightened, int prideSize) {
        super(name, species, age, habitatStructure, hasCleanHabitat, dateLastCleaned);
        this.isEasilyFrightened = isEasilyFrightened;
        this.prideSize = prideSize;
    }

    public void cleanHabitat(){
        if(this.hasCleanHabitat()){
            System.out.println("Already clean!");
        } else if(isEasilyFrightened()){
            System.out.println("Not going to clean it.");
        } else {
            this.setHasCleanHabitat(true);
        }
    }

    public boolean isEasilyFrightened() {
        return isEasilyFrightened;
    }

    public void setEasilyFrightened(boolean easilyFrightened) {
        isEasilyFrightened = easilyFrightened;
    }

    public int getPrideSize() {
        return prideSize;
    }

    public void setPrideSize(int prideSize) {
        this.prideSize = prideSize;
    }
}
