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
class SeatBeltEngaged  extends TimerTask {
    boolean user = true ;
    
    @Override
    public void run() {
       ReedSwitch R = new ReedSwitch();
        int log =(int) R.getSeatBeltlog();
        if(user == true){
        System.out.println("Seatbelt open" );
        }
        else
        {
         System.out.println("seat belt close" );
        }
    }
       
    }
    

