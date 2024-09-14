package Parking_Lot.Admin;

import Parking_Lot.Parking.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Admin {
    private final String id;
    private Contact contact;
    public Admin()
    {
        id= UUID.randomUUID().toString();
    }
    public void setParkingStrategy(ParkingStrategy parkingStrategy){
        ParkingLot.INSTANCE.setPStrategy(parkingStrategy);
    }
    public void addFloor(Floor f)
    {
        ParkingLot.INSTANCE.getFloorList().add(f);
    }
    public void addParkingSpace(Floor f, ParkingSpace p)
    {
        f.addParkingSpace(p);
    }
    public void addEntryGate(EntryGate e)
    {
        ParkingLot.INSTANCE.getEntries().add(e);
    }
    public void addExitGate(ExitGate e)
    {
        ParkingLot.INSTANCE.getExits().add(e);
    }
}
