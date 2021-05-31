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
public class TyrePressureSensor  extends Thread {
     long Delay = 5*1000;

    @Override
    public void run() {
        Timer timer = new Timer();
        MeasurePressure takepress =  new MeasurePressure();
       timer.schedule(takepress, 0, Delay);
        
    }

    
}
