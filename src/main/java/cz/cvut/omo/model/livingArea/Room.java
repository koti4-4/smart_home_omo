package cz.cvut.omo.model.livingArea;

import cz.cvut.omo.model.member.*;
import cz.cvut.omo.model.device.*;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private final List<HouseMember> houseMembers;
    private final List<Device> devices;

    public Room(List<HouseMember> houseMembers, List<Device> devices) {
        this.houseMembers = houseMembers;
        this.devices = devices;
    }

    public List<HouseMember> getResidents() {
        return new ArrayList<>(houseMembers);
    }

    public void addResident(Person person) {
        houseMembers.add(person);
    }

    public void removeResident(HouseMember person) {
        houseMembers.remove(person);
    }

    public List<Device> getDevices() {
        return new ArrayList<>(devices);
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

}
