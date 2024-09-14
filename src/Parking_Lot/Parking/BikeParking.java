package Parking_Lot.Parking;

import lombok.Getter;
import lombok.Setter;


public class BikeParking extends ParkingSpace{
    public BikeParking(String spaceId)
    {
        super(spaceId,ParkingSpaceType.BIKE_PARKING);
    }
}
