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
public class Creator extends Observer {
    Container sub;
    
    void addCar() {
        sub.push(Factory.createCar());
    }
}
