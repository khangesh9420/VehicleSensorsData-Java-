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
class DoorFunction  extends TimerTask {
     boolean user = true ;
    
    @Override
    public void run() {
       LeafSwitch L = new LeafSwitch();
        int log =(int) L.getDoorlog();
        if(user == true){
        System.out.println("Door is  open"  );
        }
        else
        {
         System.out.println("Door is close" );
        }
    }
    
}
