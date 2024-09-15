package Elevator.Model;

import Elevator.Model.State.ElevatorState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Elevator  {
    ElevatorState currState;
    int currFloor;

    public Elevator()
    {
        this.currState=ElevatorState.WAIT;
        this.currFloor=0;
    }
    public void move(int floor)
    {
        System.out.println("GOING "+updateState(floor,currFloor));
        System.out.println("Moving "+currState+ " to: "+floor+ " floor from:"+currFloor+" floor");
        currFloor=floor;
        updateState(floor,currFloor);
    }
    public ElevatorState updateState(int floor,int currFloor)
    {
        if(floor>currFloor) currState=ElevatorState.UP;
        else if (floor<currFloor) currState=ElevatorState.DOWN;
        else currState=ElevatorState.WAIT;
        return currState;
    }
}
