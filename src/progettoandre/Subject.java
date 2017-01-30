/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoandre;

import java.util.ArrayList;

/**
 *
 * @author buglil
 */
public abstract class Subject {
    protected ArrayList<Observer> obsArr;

    public Subject() {
        this.obsArr = new ArrayList<>();
    }
    
    void attach(Observer obs) {
        this.obsArr.add(obs);
    }
    
    void detach(Observer obs) {
        this.obsArr.remove(obs);
    }
    
    void notifyAllObservers() {
        // TODO : notificare a tutti gli observer
    }           
    
}
