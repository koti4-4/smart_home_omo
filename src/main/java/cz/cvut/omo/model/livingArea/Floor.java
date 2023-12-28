package cz.cvut.omo.model.livingArea;

import java.util.List;

public class Floor {

    private final int floorNumber;
    private List<Room> rooms;

    public Floor(int floorNumber, List<Room> rooms) {
        this.floorNumber = floorNumber;
        this.rooms = rooms;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room getRoom(int index) {
        return rooms.get(index);
    }

    public List<Room> getRooms () {
        return rooms;
    }

}
