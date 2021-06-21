/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.worker.permanentworker;

import za.ac.tut.worker.Worker;

/**
 *
 * @author user
 */
public class PermanentWorker extends Worker{
    private int numberOfDaysWorkedPerMonth;
    
    public PermanentWorker(){
        this.numberOfDaysWorkedPerMonth=0;
    }
    
    public PermanentWorker(String name,int numOfDaysWorkedPerMonth){
        super(name);
        this.numberOfDaysWorkedPerMonth= numOfDaysWorkedPerMonth;
    }

    public int getNumberOfDaysWorkedPerMonth() {
        return numberOfDaysWorkedPerMonth;
    }

    public void setNumberOfDaysWorkedPerMonth(int numberOfDaysWorkedPerMonth) {
        this.numberOfDaysWorkedPerMonth = numberOfDaysWorkedPerMonth;
    }

    @Override
    public String toString() {
        return "PermanentWorker{" + "numberOfDaysWorkedPerMonth=" + numberOfDaysWorkedPerMonth + '}';
    }
    
}
