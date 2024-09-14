package Parking_Lot.Parking;

import java.time.temporal.ChronoUnit;

public class DayPaymentStrategy extends PaymentStrategy{
    public DayPaymentStrategy()
    {
        this.setBikeCharges(100);
        this.setCarCharges(200);
        this.setTruckCharges(300);
    }
    @Override
    public double calculateCost(Ticket t)
    {
        long days= ChronoUnit.DAYS.between(t.getExitTime(),t.getEntryTime());
        return days*getChargeType(t.getVehicle());
    }
}
