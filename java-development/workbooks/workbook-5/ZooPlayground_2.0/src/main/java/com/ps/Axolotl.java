package com.ps;

public class Axolotl extends Animal {
    private boolean isCurrentlyHealing;

    public Axolotl(String name, String species, int age, String habitatStructure, boolean hasCleanHabitat, String dateLastCleaned, boolean isCurrentlyHealing) {
        super(name, species, age, habitatStructure, hasCleanHabitat, dateLastCleaned);
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
