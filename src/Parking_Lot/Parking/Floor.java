package Parking_Lot.Parking;

import Parking_Lot.Vehicle.Vehicle;
import Parking_Lot.Vehicle.VehicleType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Floor {
    private final String floorId;
    private Map<ParkingSpaceType, List<ParkingSpace>> pSpaces = new HashMap<>();

    public Floor(String floorId)
    {
        this.floorId=floorId;
        pSpaces.put(ParkingSpaceType.BIKE_PARKING,new ArrayList<>());
        pSpaces.put(ParkingSpaceType.CAR_PARKING,new ArrayList<>());
        pSpaces.put(ParkingSpaceType.TRUCK_PARKING,new ArrayList<>());
    }
    public void addParkingSpace(ParkingSpace p)
    {
        pSpaces.get(p.getPType()).add(p);
    }
    public void removeParkingSpace(ParkingSpace p)
    {
        pSpaces.get(p.getPType()).remove(p);
    }
    public boolean canParkVehicle(VehicleType vType) {
        for (ParkingSpace p : pSpaces.get(getSpaceTypeForVehicle(vType))) {
            if (p.isEmpty) return true;
        }
        return false;
    }
    private ParkingSpaceType getSpaceTypeForVehicle(VehicleType vType){
        switch (vType){
            case CAR : return ParkingSpaceType.CAR_PARKING;
            case BIKE: return ParkingSpaceType.BIKE_PARKING;
            case TRUCK: return ParkingSpaceType.TRUCK_PARKING;
        }
        return null;
    }
    public ParkingSpace getSpace(Vehicle v)
    {
        List<ParkingSpace> availableSpaces = new ArrayList<>();
        for(ParkingSpace p:pSpaces.get(getSpaceTypeForVehicle(v.getVehicleType())))
        {
            if(p.isEmpty) availableSpaces.add(p);
        }
        return ParkingLot.INSTANCE.getPStrategy().park(availableSpaces);
    }




















}
