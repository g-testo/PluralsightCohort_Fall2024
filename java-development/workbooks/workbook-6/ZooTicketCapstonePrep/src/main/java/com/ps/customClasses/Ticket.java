package com.ps.customClasses;

import java.util.ArrayList;
import java.util.List;

public abstract class Ticket implements Pricing{
    private String ownerName;
    private String membership;
    private List<AddOn> addOns;
    private List<Experience> experiences;

    public Ticket(String ownerName, String membership) {
        this.ownerName = ownerName;
        this.membership = membership;
        this.addOns = new ArrayList<>();
        this.experiences = new ArrayList<>();
    }
    public void addAddOn(AddOn addOn){
        addOns.add(addOn);
    }

    public List<AddOn> getAddOns(){
        return this.addOns;
    }

    public List<Experience> getExperiences(){
        return this.experiences;
    }

    public void removeAddOn(AddOn addOn){
        addOns.remove(addOn);
    }

    public void addExperience(Experience experience){
        experiences.add(experience);
    }
    public void removeExperience(Experience experience){
        experiences.remove(experience);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %s", this.ownerName, this.addOns, this.experiences);
    }
}
