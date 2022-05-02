/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cscountdown;

/**
 *
 * @author Utente
 */
public class Countdown extends Thread{
    private int tempo;
    public Countdown(int t){
      this.tempo=t;
    }
    @Override
    public void run(){
        for(int i = tempo;i>0;i++){
            System.out.println(i);
           
        }
    }
}
