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
class MQ3Sens {
        private static final double Base_Value= 80 ;
      public double getBreath() {
       
       return  Base_Value + (new Random(). nextDouble()) * 10;
    
}
    
}
