package Elevator;

import Elevator.Model.Elevator;

public class ElevatorAppln {
    public static void main(String[] args) {
        System.out.println("Hi! Welcome to Lift!");
        Elevator e = new Elevator();

        System.out.println("We are at "+e.getCurrFloor());
        e.move(10);
        System.out.println(e.getCurrFloor()+" "+e.getCurrState());

        System.out.println("We are at "+e.getCurrFloor());
        e.move(3);
        System.out.println(e.getCurrFloor()+" "+e.getCurrState());

        System.out.println("We are at "+e.getCurrFloor());
        e.move(1);
        System.out.println(e.getCurrFloor()+" "+e.getCurrState());

    }
}
