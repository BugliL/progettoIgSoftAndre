/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoandre;

/**
 *
 * @author buglil
 */
public abstract class Observer {
    protected Subject sub;
    
    abstract void Update();

    /**
     * @return the sub
     */
    public Subject getSubject() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSubject(Subject sub) {
        this.sub = sub;
    }
}
