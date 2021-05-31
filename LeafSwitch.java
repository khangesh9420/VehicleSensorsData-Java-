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
class LeafSwitch {
    private final Random randomGenerator = new Random();

    public double getDoorlog() {
        if(randomGenerator.nextBoolean()){
            return 1;
        }
       
       return  0;
     
    }
    
}
