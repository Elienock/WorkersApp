/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendaniapp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import za.ac.tut.worker.Worker;
import za.ac.tut.worker.permanentworker.PermanentWorker;
import za.ac.tut.worker.seasonalworker.SeasonalWorker;
import za.ac.tut.workersmanager.WorkersManager;

/**
 *
 * @author user
 */
public class RendaniApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare Variables
        List <Worker> workers= new ArrayList<>();
        List<Double> salaries= new ArrayList<>();
        WorkersManager wm = new WorkersManager();
        
        //Populate a list of workers with workers
        workers.add(new PermanentWorker("Tresor",20));
        workers.add(new PermanentWorker("Norbert", 13));
        workers.add(new PermanentWorker("Aurelie",17));
        workers.add(new SeasonalWorker("Nebia",74));
        workers.add(new SeasonalWorker("Jean Luc",128));
        
        //Calculate and store the salaries of the five different workers
        wm.determineSalaries(workers, salaries);
        
        //Determine best seasonal worker
     SeasonalWorker bestSeasonalWorker= wm.determineBestSeasonalWorker(workers);
        //Display the information
        displayWorkersInformation(workers,salaries,bestSeasonalWorker);
    }
      public static void displayWorkersInformation(List <Worker> workers,List <Double> salaries,SeasonalWorker bestSeasonalWorker){
          //Declaring Variables
          String data="";
          Worker worker;
          PermanentWorker permanentWorker;
          SeasonalWorker seasonalWorker;
          
          //iterate through
          for(int i=0;i<workers.size();i++){
              //get workers at index
              worker= workers.get(i);
              
              if(worker instanceof PermanentWorker){
                  //downcast
                  permanentWorker= (PermanentWorker) worker;
                  
                  data= data + "Permanent Worker" + "\n" +
                            "Name: " + permanentWorker.getName() + "\n" +
                            "Salary: R" + salaries.get(i) + "\n\n";
              }else{
                  seasonalWorker = (SeasonalWorker) worker;
                  
                  data= data + "Seasonal Worker" + "\n" + 
                          "Name: " + seasonalWorker.getName() +"\n" +
                          "Salary: R" + salaries.get(i) + "\n\n";
              }
               
          }
          //best seasonal worker
          data= data +("Best Seasonal Worker " +"\n" +
                  "Name: " + bestSeasonalWorker.getName() + "\n" +
                  "Number of Bags: " + bestSeasonalWorker.getNumberOfBagsCompletedPerMonth());
          //display
          JOptionPane.showMessageDialog(null, data,"Workers Information",JOptionPane.INFORMATION_MESSAGE);
         
      }
}
