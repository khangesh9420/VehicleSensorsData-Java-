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
class TakeBreath  extends TimerTask {

    @Override
    public void run() {
        
       MQ3Sens M = new MQ3Sens();
        int log =(int) M.getBreath();
         double Measure;
        Measure = (double) M.getBreath();
         
         if (Measure < 100)
         {
           System.out.println(" The driver is Ohk Engine start"+ M);
         }
         if(Measure >110) {
             
             System.out.println(" The Driver is Drunk  Dont Start the car "+ M);
         }
        
        
        
    }
    
    
}
