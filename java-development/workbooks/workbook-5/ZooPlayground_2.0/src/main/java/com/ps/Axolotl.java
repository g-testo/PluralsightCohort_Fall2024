package com.ps;

public class Axolotl extends Animal {
    private boolean isCurrentlyHealing;

    public Axolotl(String name, int age, String dateLastCleaned, boolean isCurrentlyHealing) {
        super(name + " the Axolotl", "Amphibian", age, "Tank", true, dateLastCleaned);
        this.isCurrentlyHealing = isCurrentlyHealing;
    }

    public void cleanHabitat(){
        if(isCurrentlyHealing){
            System.out.println("Currently healing, not cleaning tank");
        } else {
            this.setHasCleanHabitat(true);
        }
    }

    public boolean isCurrentlyHealing() {
        return isCurrentlyHealing;
    }

    public void setCurrentlyHealing(boolean currentlyHealing) {
        isCurrentlyHealing = currentlyHealing;
    }
}
