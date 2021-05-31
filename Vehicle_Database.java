/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_database;

import javax.microedition.midlet.MIDlet;

/**
 *
 * @author khang
 */
public class Vehicle_Database extends MIDlet {
    TemperatureSensor temp1 ;
    TyrePressureSensor press1;
    SeatBeltSensor seatBelt;
    SpeedSensor speed;
    AlcoholSensor alco;
    DoorSensor door;
   
    
    @Override
    public void startApp() {
        temp1 = new TemperatureSensor();
        temp1.start();
        press1 = new TyrePressureSensor();
        press1.start();
        seatBelt = new SeatBeltSensor();
        seatBelt.start();
        alco = new AlcoholSensor();
        alco.start();
        door = new DoorSensor();
        door.start();
        speed = new SpeedSensor();
        speed.start();
        
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
    }
}
