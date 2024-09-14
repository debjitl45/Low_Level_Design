package Parking_Lot;

import Parking_Lot.Admin.Admin;
import Parking_Lot.Parking.*;
import Parking_Lot.Vehicle.BikeVehicle;
import Parking_Lot.Vehicle.Vehicle;
import Parking_Lot.Vehicle.VehicleType;

public class ParkingLotAppln {
    public static void main(String[] args) {
        System.out.println("Welcome to Parking Lot");
        ParkingLot pl=ParkingLot.INSTANCE;

        Address address=new Address();
        address.setAddressLine1("DMart");
        address.setAddressLine2("Virugambakkam");
        address.setCity("Chennai");
        address.setState("Tamil Nadu");
        address.setCountry("India");
        address.setPinCode("123456");

        pl.setAddress(address);

        Admin admin=new Admin();

        admin.setParkingStrategy(new DefaultParking());

        Floor f1=new Floor("1"); Floor f2=new Floor("2"); Floor f3=new Floor("3");
        admin.addFloor(f1);
        admin.addFloor(f2);
        admin.addFloor(f3);

        EntryGate e1=new EntryGate("1"); EntryGate e2=new EntryGate("2");
        admin.addEntryGate(e1);
        admin.addEntryGate(e2);

        ExitGate e3=new ExitGate("3"); ExitGate e4=new ExitGate("4");
        admin.addExitGate(e3);
        admin.addExitGate(e4);

        ParkingSpace p1=new CarParking("1");
        ParkingSpace p2=new BikeParking("2");
        ParkingSpace p3=new TruckParking("3");
        ParkingSpace p4=new CarParking("1");
        admin.addParkingSpace(f1,p1);
        admin.addParkingSpace(f1,p2);
        admin.addParkingSpace(f1,p4);

        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.CAR));
        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.BIKE));
        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.TRUCK));
        System.out.println(ParkingLot.INSTANCE.getEntries().size());

        Vehicle v1=new BikeVehicle("B123");
        Ticket t1=e1.generateTicket(v1);
        System.out.println(null==t1);
        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.BIKE));
        Payment pay1=e3.makePayment(PaymentType.CARD,new HourlyPaymentStrategy(),t1);
        System.out.println(pay1.getAmount());

        Vehicle v2=new BikeVehicle("B456");
        Ticket t2=e2.generateTicket(v2);
        System.out.println(null==t2);
        System.out.println(ParkingLot.INSTANCE.isParkingSpaceAvailable(VehicleType.BIKE));
        Payment pay2=e4.makePayment(PaymentType.UPI,new HourlyPaymentStrategy(),t2);
        System.out.println(pay2.getAmount());

        System.out.println(ParkingLot.INSTANCE.getFloorList().getFirst().getPSpaces().get(ParkingSpaceType.CAR_PARKING).size());
        System.out.println(ParkingLot.INSTANCE.getFloorList().getFirst().getPSpaces().get(ParkingSpaceType.BIKE_PARKING).size());
        System.out.println(ParkingLot.INSTANCE.getFloorList().getFirst().getPSpaces().get(ParkingSpaceType.TRUCK_PARKING).size());
    }
























}
