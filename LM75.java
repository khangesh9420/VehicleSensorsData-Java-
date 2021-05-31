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
class LM75 {
     private static final double Base_Temperature = 32.5 ;
     
       public double getTemperature() {
       
       return  Base_Temperature + (new Random(). nextDouble()) * 10;
    
}
}
