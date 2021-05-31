/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_database;

import java.util.Timer;

/**
 *
 * @author khang
 */
public class SeatBeltSensor extends Thread {

    @Override
    public void run() {
        long Delay = 5 *1000;
        Timer timer = new Timer(); // create a object called timer to take the tempetarute in every next 15 sec.
        SeatBeltEngaged takevalue= new SeatBeltEngaged(); //create a object called taketempe.
      timer.schedule(takevalue, 0, Delay); 
    }

    
    
}
