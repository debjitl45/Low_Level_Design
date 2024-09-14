package Parking_Lot.Parking;

import java.time.temporal.ChronoUnit;

public class HourlyPaymentStrategy extends PaymentStrategy{
    public HourlyPaymentStrategy(){
        this.setBikeCharges(10);
        this.setCarCharges(20);
        this.setTruckCharges(30);
    }
    @Override
    public double calculateCost(Ticket t)
    {
        long hrs= ChronoUnit.HOURS.between(t.getExitTime(),t.getEntryTime());
        return hrs*getChargeType(t.getVehicle());
    }
}
