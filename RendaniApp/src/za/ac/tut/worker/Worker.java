/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.worker;

/**
 *
 * @author user
 */
public abstract class Worker {
    private String name;
    
    public Worker(){
        this.name="";
    }
    
    public Worker(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + '}';
    }
    
}
