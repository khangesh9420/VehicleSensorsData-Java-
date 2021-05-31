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
class MeasureTemp extends TimerTask  {

    @Override
    public void run() {
        LM75 t   = new LM75 ();
       double temp =(double) t.getTemperature();
       if (temp > 70) {
           System.out.println("Temp"+ "higher than 70 warning " + temp);
       }
       else
           System.out.println("Battery is stable");
    }
    
}
