package com.ps;

public class Lion extends Animal{
    private boolean isEasilyFrightened;
    private int prideSize;

    public Lion(String name, int age, String habitatStructure, String dateLastCleaned, boolean isEasilyFrightened, int prideSize) {
        super(name + " the Lion", "Mammal", age, habitatStructure, true, dateLastCleaned);
        this.isEasilyFrightened = isEasilyFrightened;
        this.prideSize = prideSize;
    }

    public void cleanHabitat(){
        if(this.hasCleanHabitat()){
            System.out.println(this.getName() + "'s habitat is already clean!");
        } else if(isEasilyFrightened()){
            System.out.println(this.getName() + " is easily frightened. Not cleaning it.");
        } else {
            System.out.println("Cleaned " + this.getName() + "'s habitat");
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
