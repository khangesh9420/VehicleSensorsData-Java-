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
class Optocoupler {
    private static final double Base_speed = 60 ;
     
       public double getSpeed() {
       
       return  Base_speed  + (new Random(). nextDouble()) * 10;
    
}
}