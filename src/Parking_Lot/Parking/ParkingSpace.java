package Parking_Lot.Parking;

import Parking_Lot.Vehicle.Vehicle;
import lombok.Getter;

@Getter
public abstract class ParkingSpace {
    private final String spaceId;
    private final ParkingSpaceType pType;
    private Vehicle vehicle;
    boolean isEmpty;

    public ParkingSpace(String spaceId,ParkingSpaceType type)
    {
        this.spaceId=spaceId;
        this.pType=type;
        this.isEmpty=true;
    }
    public void parkVehicle(Vehicle v)
    {
        isEmpty=false;
        vehicle=v;
    }
    public void removeVehicle()
    {
        vehicle=null;
        isEmpty=true;
    }
}
