package Parking_Lot.Parking;

import java.util.List;

public class NaturalOrderParking extends  ParkingStrategy{
    public ParkingSpace park(List<ParkingSpace> availableSpaces)
    {
        return availableSpaces.get(0);
    }
}
