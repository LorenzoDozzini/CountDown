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
public class GestioneServer {

   
    public static void main(String[] args) {
        Server s = new Server(2000);
        s.inAscolto();
        s.scrivi("Benvenuto client");
    }
    
}
