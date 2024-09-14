package Parking_Lot.Parking;

import lombok.Setter;

import java.util.List;

@Setter
public class DefaultParking extends ParkingStrategy{
    @Override
    public ParkingSpace park(List<ParkingSpace> availableSpaces) {
        return availableSpaces.getFirst();
    }
}
