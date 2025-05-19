package controller;

import command.Command;

public class ParkingController {
    public void executeCommand(Command command){
        command.execute();
    }
}
