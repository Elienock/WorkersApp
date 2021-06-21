/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.workersmanager;

import java.util.ArrayList;
import java.util.List;
import za.ac.tut.worker.Worker;
import za.ac.tut.worker.permanentworker.PermanentWorker;
import za.ac.tut.worker.seasonalworker.SeasonalWorker;
import za.ac.tut.workersdatainterface.WorkersDataInterface;
import za.ac.tut.workersinterface.WorkersInterface;

/**
 *
 * @author user
 */
public class WorkersManager implements WorkersInterface, WorkersDataInterface {

    public WorkersManager(){
        
    }
    
    @Override
    public void determineSalaries(List<Worker> workers, List<Double> salaries) {
      //declare variables
        double salary;
       PermanentWorker permanentWorker;
       SeasonalWorker seasonalWorker;
       
       //iterate through
       for(Worker worker:workers){
           if(worker instanceof PermanentWorker){
           permanentWorker=(PermanentWorker) worker;
           
           salary=PERMANENT_WORKERS_PAYMENT_RATE * 8 * permanentWorker.getNumberOfDaysWorkedPerMonth();
           }else{
               seasonalWorker=(SeasonalWorker) worker;
               
               salary=SEASONAL_WORKERS_PAYMENT_RATE * seasonalWorker.getNumberOfBagsCompletedPerMonth();
           }
           //Store
           salaries.add(salary);
       }
    }

    @Override
    public SeasonalWorker determineBestSeasonalWorker(List<Worker> workers) {
       SeasonalWorker bestSeasonalWorker=null;
        List<SeasonalWorker> seasonalWorkers=  new ArrayList<>();
       
        for(int g=0;g<workers.size();g++){
            //check if it is workers
            if(workers.get(g) instanceof SeasonalWorker){
            SeasonalWorker seasonalWorker =(SeasonalWorker) workers.get(g);
            //store the seasonal workerks in a list of only seasonal workers
            seasonalWorkers.add(seasonalWorker);
            }
        }
        
for(int i=0;i<seasonalWorkers.size() ;i++){
    for(int j=i+1;j<seasonalWorkers.size();j++){
        
        //get the current Element
        SeasonalWorker seasonalWorkerAtI =(SeasonalWorker) seasonalWorkers.get(i);
        
        //get the next Element
        SeasonalWorker seasonalWorkerAtJ=(SeasonalWorker) seasonalWorkers.get(j);
        
        //compare
        if(seasonalWorkerAtI.getNumberOfBagsCompletedPerMonth() < seasonalWorkerAtJ.getNumberOfBagsCompletedPerMonth()){
        
            //Swapping the elements
        seasonalWorkers.set(i, seasonalWorkerAtJ);
        seasonalWorkers.set(j, seasonalWorkerAtI);
        
        //getting the best number in the index
         bestSeasonalWorker=seasonalWorkers.get(0);
        }
    }
}

        
 return bestSeasonalWorker;
}
}
        
    
    

