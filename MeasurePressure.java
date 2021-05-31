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
class MeasurePressure  extends TimerTask{

    @Override
    public void run() {
        TPMS p = new TPMS();
         double Press;
        Press = (double) p.getCurrentPressure();
         
         if (Press <30)
         {
           System.out.println(" There is less air in the tyre fill it"+ Press);
         }
         else{
             System.out.println(" Tyre Pressure is ohk "+ Press);
         }
         
         
        }
    }
    

