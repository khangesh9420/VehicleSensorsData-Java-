/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_database;

import java.util.Random;

/**
 *
 * @author khang
 */
class TPMS {
    double Base_Pressure = 33 ;
    
    public double getCurrentPressure()
    {
      
        
       return  Base_Pressure +(new Random().nextDouble()) * 10 ;
       
        
        
    }
    
}
