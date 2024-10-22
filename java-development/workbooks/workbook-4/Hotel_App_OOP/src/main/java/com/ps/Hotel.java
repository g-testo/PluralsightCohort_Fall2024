package com.ps;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }


    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite){
            int suitesAvailable = getAvailableSuites();
            boolean hasAvailableSuites = suitesAvailable >= numberOfRooms;
            if(hasAvailableSuites){
                this.bookedSuites += numberOfRooms;
            }
            return hasAvailableSuites;
        } else {
            int roomsAvailable = getAvailableRooms();
            boolean hasAvailableRooms = roomsAvailable >= numberOfRooms;
            if(hasAvailableRooms){
                this.bookedRooms += numberOfRooms;
            }
            return hasAvailableRooms;
        }
    }

    public int getAvailableSuites(){
        return this.numberOfSuites - this.bookedSuites;
    }
    public int getAvailableRooms(){
        return this.numberOfRooms - this.bookedRooms;
    }


//    // Determine where or not there are available rooms (Return -1), if so how many room
//    public int calcRoomAvail(int total, int booked){
//        int available = total - booked;
//    }


}
