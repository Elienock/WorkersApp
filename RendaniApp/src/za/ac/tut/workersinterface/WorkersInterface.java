/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.workersinterface;

import java.util.List;
import za.ac.tut.worker.Worker;
import za.ac.tut.worker.seasonalworker.SeasonalWorker;

/**
 *
 * @author user
 */
public interface WorkersInterface {
    public void determineSalaries(List<Worker> workers, List<Double> salaries);
    public SeasonalWorker determineBestSeasonalWorker(List<Worker> workers);
}
