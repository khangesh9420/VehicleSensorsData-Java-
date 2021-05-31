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
class ReedSwitch {
     
     private final Random randomGenerator = new Random();
     
       public int getSeatBeltlog() {
           if(randomGenerator.nextBoolean()){
            return 1;
        }
       
       return  0;
     
           
       
    
}
}
