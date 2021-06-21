/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.worker.seasonalworker;

import za.ac.tut.worker.Worker;

/**
 *
 * @author user
 */
public class SeasonalWorker extends Worker {
    private int numberOfBagsCompletedPerMonth;
    
    public SeasonalWorker(){
        this.numberOfBagsCompletedPerMonth=0;
    }
    
    public SeasonalWorker(String name,int numberOfBagsCompletedPerMonth){
        super(name);
        this.numberOfBagsCompletedPerMonth=numberOfBagsCompletedPerMonth;
    }

    public int getNumberOfBagsCompletedPerMonth() {
        return numberOfBagsCompletedPerMonth;
    }

    public void setNumberOfBagsCompletedPerMonth(int numberOfBagsCompletedPerMonth) {
        this.numberOfBagsCompletedPerMonth = numberOfBagsCompletedPerMonth;
    }

    @Override
    public String toString() {
        return "SeasonalWorker{" + "numberOfBagsCompletedPerMonth=" + numberOfBagsCompletedPerMonth + '}';
    }
    
}
