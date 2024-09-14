package Parking_Lot.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Vehicle {
    private String regNo;
    private VehicleType vehicleType;

    public Vehicle(String regNo, VehicleType vehicleType)
    {
        this.regNo=regNo;
        this.vehicleType=vehicleType;
    }
}
