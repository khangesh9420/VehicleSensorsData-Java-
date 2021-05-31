/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_database;

import java.util.TimerTask;

/**
 *
 * @author khang
 */
class TakeSpeed  extends TimerTask {
    public void run() {
        Optocoupler O   = new Optocoupler ();
       double Speedvehicle =(double) O.getSpeed();
       if ( Speedvehicle> 100) {
           System.out.println(" speed is more than 100  " + Speedvehicle);
       }
       else{
           System.out.println(" Car is in normal speed  " + Speedvehicle);
       }
       
    }
    
}
