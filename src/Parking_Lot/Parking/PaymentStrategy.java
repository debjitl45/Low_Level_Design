package Parking_Lot.Parking;

import Parking_Lot.Vehicle.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentStrategy {
    private double bikeCharges;
    private double carCharges;
    private double truckCharges;

    public double calculateCost(Ticket t) {
        return 0;
    }

    protected double getChargeType(Vehicle v)
    {
        switch (v.getVehicleType())
        {
            case BIKE : return bikeCharges;
            case CAR: return carCharges;
            case TRUCK: return truckCharges;
        }
        return 0;
    }
}
